package com.company;

import javax.smartcardio.CardException;

public class Main {

    public static void main(String[] args) throws CardException {
        boolean wait = true;
        SmartcardConnector smartcardConnector = new SmartcardConnector();

        while (wait) {
            try {
                smartcardConnector.initializeTerminal();
                if (smartcardConnector.cardTerminal.isCardPresent()) {
                    smartcardConnector.connectCard();
                    smartcardConnector.getCardUserData();
                    smartcardConnector.cardTerminal.waitForCardAbsent(100000);
                }

            } catch (Exception e) {
//                System.out.println(e);
            }
        }
    }
}

