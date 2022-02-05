package ru.korotaeva.vasilisa.conventerm;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ValCurs {

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

    public ValCurs.Valute getValute() {
        return Valute;
    }

    public class Valute{
        @Attribute
        private String ID;

        @Element
        private  int NumCode;

        @Element
        private String CharCode;

        @Element
        private  int Nominal;

        @Element
        private String Name;

        @Element
        private Double Value;

        public String getID() {
            return ID;
        }

        public int getNumCode() {
            return NumCode;
        }

        public String getCharCode() {
            return CharCode;
        }

        public int getNominal() {
            return Nominal;
        }

        public String getName() {
            return Name;
        }

        public Double getValue() {
            return Value;
        }
    }
}

