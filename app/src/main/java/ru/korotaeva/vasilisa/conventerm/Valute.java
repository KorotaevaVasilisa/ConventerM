package ru.korotaeva.vasilisa.conventerm;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name="Value",strict = false)
public class Valute implements Serializable {
//        @Attribute(required = false)
//       private String ID;

        @Element(required = false, name = "NumCode")
        private Integer numCode;

        @Element(required = false, name = "CharCode")
        private String charCode;

        @Element(required = false, name = "Nominal")
        private Integer nominal;

        @Element(required = false, name = "Name")
        private String name;

        @Element(required = false, name = "Value")
        private Double value;

    @Override
    public String toString() {
        return "Valute{" +
//                "ID='" + ID + '\'' +
                ", numCode=" + numCode +
                ", charCode='" + charCode + '\'' +
                ", nominal=" + nominal +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public Valute(Integer numCode,String charCode,Integer nominal,String name,Double value) {
       this.numCode=numCode;
       this.charCode=charCode;
       this.nominal=nominal;
       this.name=name;
       this.value=value;
        }

        public Integer getNumCode() {
                return numCode;
        }

        public void setNumCode(Integer numCode) {
                this.numCode = numCode;
        }

        public String getCharCode() {
                return charCode;
        }

        public void setCharCode(String charCode) {
                this.charCode = charCode;
        }

        public Integer getNominal() {
                return nominal;
        }

        public void setNominal(Integer nominal) {
                this.nominal = nominal;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Double getValue() {
                return value;
        }

        public void setValue(Double value) {
                this.value = value;
        }
}
