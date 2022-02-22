package ru.korotaeva.vasilisa.conventerm;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.List;

@Root(name = "ValCurs",strict = false)
public class ValCurs implements Serializable {
//    @Attribute(required = false)
//    private String Date;
//
//    @Attribute(required = false)
//    private String name;

    @ElementList(inline=true,name = "Valute")
    private List<Valute> Valutes;
//
//    public String getDate() {
//        return Date;
//    }
//
//    public String getName() {
//        return name;
//    }

    public ValCurs() {
    }

    public List<Valute> getValutes() {
        return Valutes;
    }

    @Override
    public String toString() {
        return "ValCurs{" +
//                "Date='" + Date + '\'' +
//                ", name='" + name + '\'' +
                ", Valutes=" + Valutes +
                '}';
    }
}


