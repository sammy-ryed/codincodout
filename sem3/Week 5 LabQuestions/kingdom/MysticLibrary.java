package com.example.kingdom;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MysticLibrary {
    private final Map<String,String> bookCollection;
    private int knowledgeLevel;

    public MysticLibrary(Map<String,String> bookCollection, int knowledgeLevel) {
        this.bookCollection = new HashMap<>(bookCollection == null ? Collections.emptyMap() : bookCollection);
        this.knowledgeLevel = knowledgeLevel;
    }

    public Map<String,String> getBookCollection() { return Collections.unmodifiableMap(bookCollection); }
    public int getKnowledgeLevel() { return knowledgeLevel; }
    public void setKnowledgeLevel(int knowledgeLevel) { this.knowledgeLevel = knowledgeLevel; }

    @Override
    public String toString() {
        return "MysticLibrary{books=" + bookCollection.size() + ", knowledgeLevel=" + knowledgeLevel + "}";
    }
}
