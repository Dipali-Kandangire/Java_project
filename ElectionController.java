package com.tka.controller;

import java.util.ArrayList;
import com.tka.service.ElectionService;

public class ElectionController {
    public ArrayList<String> getCandidateState() {
        ElectionService service = new ElectionService();
        return service.getCandidateState();
    }
}
