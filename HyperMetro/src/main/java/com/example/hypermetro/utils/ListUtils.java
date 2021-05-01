package com.example.hypermetro.utils;

import com.example.hypermetro.list.DoublyLinkedList;
import com.google.gson.JsonObject;

public final class ListUtils {

    private ListUtils() {}

    public static DoublyLinkedList<String> loadFromJson(JsonObject json) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        json.entrySet().forEach(entry -> list.addLast(entry.getValue().getAsString()));
        return list;
    }
}
