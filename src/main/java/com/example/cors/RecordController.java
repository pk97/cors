package com.example.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecordController {

    private static final List<Record> records;

    static {
        records = new ArrayList<>();
        records.add(new Record(1, "hi"));
        records.add(new Record(2, "bye"));
        records.add(new Record(3, "hi again"));
    }

    @GetMapping("/records")
public Record getRecords(@RequestParam() Integer id) {
        System.out.println("request came!"+id);
        return records.get(id);
}
}
