package examples.mailValidation;

public enum MailRegex {

    VALID_EMAIL_ADDRESS_REGEX(null);

    private String regexStr;

    MailRegex(final String regexStr) {
        this.regexStr = regexStr;
    }

    public String getRegex() {
        return regexStr;
    }

    public void setRegex(final String regexStr) {
        this.regexStr = regexStr;
    }

}
