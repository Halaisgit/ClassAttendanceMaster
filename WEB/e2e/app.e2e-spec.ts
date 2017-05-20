import {WEBPage} from './app.po';

describe('web App', () => {
  let page: WEBPage;

  beforeEach(() => {
    page = new WEBPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
