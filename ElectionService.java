package com.tka.service;

import java.util.ArrayList;
import com.tka.DAO.ElectionDao1;

public class ElectionService {
    public ArrayList<String> getCandidateState() {
        ElectionDao1 dao = new ElectionDao1();
        return dao.getCandidateState();
    }
}
