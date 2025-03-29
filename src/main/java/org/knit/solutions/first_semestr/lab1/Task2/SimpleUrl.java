package org.knit.first_semestr.lab1.Task2;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;
    private int intParam;
    private double doubleParam;
    private String textParameter;


    public SimpleUrl(String url) {
        parseUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    public void setWebPageExtension(String webPageExtension) {
        this.webPageExtension = webPageExtension;
    }

    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public String getTextParameter() {
        return textParameter;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    public String toString() {
        return "Protocol: " + protocol + "\n" +
                "Address: " + address + "\n" +
                "Domain Zone: " + domainZone + "\n" +
                "Site Name: " + siteName + "\n" +
                "Webpage Name: " + webpageName + "\n" +
                "Webpage Extension: " + webPageExtension + "\n" +
                "Int Param: " + intParam + "\n" +
                "Double Param: " + doubleParam + "\n" +
                "Text Parameter: " + textParameter;
    }

    private void parseUrl(String url) {
            // Разделяем протокол и остальную часть
            this.protocol = url.substring(0, url.indexOf("://"));
            String rest = url.substring(url.indexOf("://") + 3);

            // Разделяем адрес сайта и остальную часть
            this.address = rest.substring(0, rest.indexOf("/"));
            String[] addressParts = this.address.split("\\.");
            this.siteName = addressParts[0];
            this.domainZone = addressParts[1];

            String path = rest.substring(rest.indexOf("/") + 1, rest.indexOf("?"));
            String[] pathParts = path.split("/");
            this.webpageName = pathParts[pathParts.length - 1];
            this.webPageExtension = webpageName.substring(webpageName.lastIndexOf(".") + 1);

            String query = rest.substring(rest.indexOf("?") + 1);
            String[] queryParams = query.split("&");

            for (String param : queryParams) {
                String[] keyValue = param.split("=");
                switch (keyValue[0]) {
                    case "intParam":
                        this.intParam = Integer.parseInt(keyValue[1]);
                        break;
                    case "doubleParam":
                        this.doubleParam = Double.parseDouble(keyValue[1]);
                        break;
                    case "textParameter":
                        this.textParameter = keyValue[1];
                        break;
                }
            }
    }

}

