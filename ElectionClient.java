package com.tka.client;

import java.util.ArrayList;
import com.tka.controller.ElectionController;

public class ElectionClient {
    public static void main(String[] args) {
        ElectionController controller = new ElectionController();
        ArrayList<String> states = controller.getCandidateState();

        if (states != null && !states.isEmpty()) {
            System.out.println("States in the Database:");
            for (String state : states) {
                System.out.println(state);
            }
        } else {
            System.out.println("No states found or error occurred.");
        }
    }
}
