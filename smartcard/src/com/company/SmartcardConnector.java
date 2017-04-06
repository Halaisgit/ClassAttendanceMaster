package com.company;

import javax.smartcardio.*;
import java.util.List;

/**
 * Created by Konrad on 2017-04-06.
 */
public class SmartcardConnector {
    TerminalFactory terminalFactory;
    List<CardTerminal> cardTerminals;
    CardTerminal cardTerminal;
    Card card;
    CardChannel cardChannel;
    CommandAPDU commandAPDU;
    ResponseAPDU responseAPDU;
    byte[] chooseELSFile = {(byte) 0x00, (byte) 0x02};
    byte[] connectToELSCatalogBytes = {(byte) 0xD6, (byte) 0x16, (byte) 0x00, (byte) 0x00, (byte) 0x30, (byte) 0x01, (byte) 0x01};

    public TerminalFactory getTerminalFactory() {
        return terminalFactory;
    }

    public void setTerminalFactory(TerminalFactory terminalFactory) {
        this.terminalFactory = terminalFactory;
    }

    public List<CardTerminal> getCardTerminals() {
        return cardTerminals;
    }

    public void setCardTerminals(List<CardTerminal> cardTerminals) {
        this.cardTerminals = cardTerminals;
    }

    public CardTerminal getCardTerminal() {
        return cardTerminal;
    }

    public void setCardTerminal(CardTerminal cardTerminal) {
        this.cardTerminal = cardTerminal;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardChannel getCardChannel() {
        return cardChannel;
    }

    public void setCardChannel(CardChannel cardChannel) {
        this.cardChannel = cardChannel;
    }

    public CommandAPDU getCommandAPDU() {
        return commandAPDU;
    }

    public void setCommandAPDU(CommandAPDU commandAPDU) {
        this.commandAPDU = commandAPDU;
    }

    public ResponseAPDU getResponseAPDU() {
        return responseAPDU;
    }

    public void setResponseAPDU(ResponseAPDU responseAPDU) {
        this.responseAPDU = responseAPDU;
    }

    void initializeTerminal() throws CardException {
        terminalFactory = TerminalFactory.getDefault();
        cardTerminals = terminalFactory.terminals().list();
        cardTerminal = cardTerminals.get(0);
    }
    void connectCard() throws CardException {
        card = cardTerminal.connect("T=0");
        cardChannel = card.getBasicChannel();
    }
    void getCardUserData() throws CardException {
        commandAPDU = new CommandAPDU(0x00, 0xA4, 0x04, 0x00, connectToELSCatalogBytes, 0x00);
        responseAPDU = cardChannel.transmit(commandAPDU);
        commandAPDU = new CommandAPDU(0x00, 0xA4, 0x02, 0x00, chooseELSFile, 0x12);
        responseAPDU = cardChannel.transmit(commandAPDU);
        commandAPDU = new CommandAPDU(0x00, 0xB0, 0x00, 0x1B, 0x30);
        responseAPDU = cardChannel.transmit(commandAPDU);
        String answer = new String(responseAPDU.getData());
        answer = answer.replaceAll("\\W", " ");
        String[] spl = answer.split("  ");
        if(spl[3].matches("[0-9]+"))
        {
            String nazwisko = spl[0].substring(0,spl[0].length() - 1).replaceAll(" ", "");
            String imie = spl[1].replaceAll(" ", "");
            String dimie = spl[2].replaceAll(" ", "");
            String indeks = spl[3].replaceAll(" ", "");
            String pesel = spl[5].replaceAll(" ", "");
            System.out.println("Nazwisko: " + nazwisko + "\nImie: " + imie + "\nDrugie Imie: " + dimie + "\nIndeks: " + indeks  + "\nPesel: " + pesel);
        }else
        {
            String nazwisko = spl[0].substring(0,spl[0].length() - 1).replaceAll(" ", "");
            String imie = spl[1].replaceAll(" ", "");
            String indeks = spl[2].replaceAll(" ", "");
            String pesel = spl[4].replaceAll(" ", "");
            System.out.println("Nazwisko: " + nazwisko + "\nImie: " + imie + "\nIndeks: " + indeks + "\nPesel: " + pesel+"\n");
        }
        card.disconnect(false);
    }
}
