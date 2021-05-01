package com.example.hypermetro.metro;


import com.example.hypermetro.exception.LineNotFoundException;
import com.example.hypermetro.list.DoublyLinkedList;
import com.example.hypermetro.list.Node;
import com.example.hypermetro.utils.ListUtils;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public enum Metro {

    INSTANCE;

    private final Map<String, DoublyLinkedList<String>> metroLines = new HashMap<>();

    Metro() {
    }

    public void init(JsonObject json) {
        json.entrySet().forEach(entry -> metroLines.put(entry.getKey(),
                ListUtils.loadFromJson(entry.getValue().getAsJsonObject())));
    }


    public void outputLine(String line) {
        if (metroLines.containsKey(line)) {
            DoublyLinkedList<String> stations = metroLines.get(line).copy();
            stations.addFirst("depot");
            stations.addLast("depot");
            System.out.println(stations);
            return;
        }
        throw new LineNotFoundException();
    }

    public void addStation(String line, String station) {
        if (metroLines.containsKey(line)) {
            metroLines.get(line).addFirst(station);
            return;
        }
        throw new LineNotFoundException();
    }

    public void appendStation(String line, String station) {
        if (metroLines.containsKey(line)) {
            metroLines.get(line).addLast(station);
            return;
        }
        throw new LineNotFoundException();
    }

    public void removeStation(String line, String station) {
        if (metroLines.containsKey(line)) {
            DoublyLinkedList<String> list = metroLines.get(line);
            Node<String> tmp = list.getHead();
            while (tmp != null) {
                if (tmp.getData().equals(station)) {
                    list.remove(tmp);
                    return;
                }
                tmp = tmp.getNext();
            }
            return;
        }
        throw new LineNotFoundException();
    }
}
