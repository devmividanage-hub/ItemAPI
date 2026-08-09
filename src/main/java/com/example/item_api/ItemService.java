package com.example.item_api;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item saveItem(Item item);
}