package com.vsqx.singer;

import com.vsqx.exception.NoSingerException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SingerReader {

    private final Map<String, String> map;

    {
        this.map = new HashMap<>();

        SAXReader reader = new SAXReader();
        File file = new File("singerList.xml");
        Document root;
        try {
            root = reader.read(file);
        } catch (DocumentException | MalformedURLException e) {
            throw new RuntimeException(e);
        }

        List<Element> list = root.getRootElement().elements("singer");

        for (Element e : list) {
            map.put(e.attributeValue("name"), e.attributeValue("id"));
        }

    }

    public SingerReader() {
    }

    public String getSingerIDByName(String name) throws NoSingerException {
        if (map.isEmpty())
            throw new NoSingerException();

        for (Map.Entry<String, String> entry : map.entrySet())
            if (name.equals(entry.getKey()))
                return entry.getValue();

        return null;
    }

    public String getSingerNameByID(String id) throws NoSingerException {
        if (map.isEmpty())
            throw new NoSingerException();

        for (Map.Entry<String, String> entry : map.entrySet())
            if (id.equals(entry.getValue()))
                return entry.getKey();

        return null;
    }
}
