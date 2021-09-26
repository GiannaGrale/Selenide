package core;

import java.io.IOException;
import java.util.Properties;

    public final class ReadProperties {
        private static core.ReadProperties instance;
        protected static Properties properties;

        private ReadProperties() {
            properties = new Properties();
            try {
                properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
                properties.load(getClass().getClassLoader().getResourceAsStream("testData.properties"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static core.ReadProperties getInstance() {
            if (instance == null) {
                instance = new core.ReadProperties();
            }
            return instance;
        }

        // Методы получения property
        public  String getTestRailSite () {return  properties.getProperty("testrailURL");}
        public  String getLogin () {return  properties.getProperty("login2");}
        public  String getPassword () {return  properties.getProperty("password2");}

        public String getURL() {
            return properties.getProperty("url");
        }

        public String getBrowserName() {
            return properties.getProperty("browser");
        }

        public boolean isHeadless() {
            return properties.getProperty("headless").equalsIgnoreCase("true");
        }

        public int getTimeOut() {
            return Integer.parseInt(properties.getProperty("timeout"));
        }

        public String getPandaURL() {
            return properties.getProperty("pandaURL");
        }
        public String getWrongPswd() {
            return properties.getProperty("passwordWrong");
        }
    }


