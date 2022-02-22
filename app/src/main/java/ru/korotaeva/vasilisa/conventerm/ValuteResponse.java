package ru.korotaeva.vasilisa.conventerm;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ValCurs", strict = false)
public class ValuteResponse {
    @Attribute
    private String Date;

    @Attribute
    private String Name;
    @Element
    private Valute Valute;
    public String getDate() {
        return Date;
    }

    public String getName() {
        return Name;
    }

    public class Valute {
        @Element(required = false, name = "NumCode")
        private String numCode;

        @Element(required = false, name = "CharCode")
        private String charCode;

        @Element(required = false, name = "Nominal")
        private String nominal;

        @Element(required = false, name = "Name")
        private String name;

        @Element(required = true, name = "Value")
        private String value;

        public String getName() {
            return name;
        }

        public String getNumCode() {
            return numCode;
        }

        public void setNumCode(String numCode) {
            this.numCode = numCode;
        }

        public String getCharCode() {
            return charCode;
        }

        public void setCharCode(String charCode) {
            this.charCode = charCode;
        }

        public String getNominal() {
            return nominal;
        }

        public void setNominal(String nominal) {
            this.nominal = nominal;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}