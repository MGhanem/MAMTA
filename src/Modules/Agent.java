/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.util.ArrayList;

/**
 *
 * @author M Ghanem
 */
public class Agent extends Noun {

    private static int numberOfAgents = 0;
    static ArrayList<ArrayList<Agent>> AgentsGroups;  // incase of Non.Hemogenious = 1 groups of Hemogenious Agents;

    public Agent() {
        id = ++numberOfDefinedAgents;
        Properties = new ArrayList<>();
        setName("Agent" + id);
    }

    public static int getNumberOfAgents() {
        return numberOfAgents;
    }

    public static void setNumberOfAgents(int numOfAgents) {
        numberOfAgents = numOfAgents;
    }

    public static ArrayList<ArrayList<Agent>> getAgentsGroups() {
        return AgentsGroups;
    }

    public static void setAgentsGroups(ArrayList<ArrayList<Agent>> AgentsGroups) {
        Agent.AgentsGroups = AgentsGroups;
    }

    public static void changeNumberOfAgents(int numOfAgents) {
        if (numOfAgents > numberOfAgents) {
            for (int i = numberOfAgents; i < numOfAgents; i++) {
                AgentsGroups.add(new ArrayList<>());
                AgentsGroups.get(AgentsGroups.size() - 1).add(new Agent());
            }
        }
        boolean f;
        if (numOfAgents < numberOfAgents) {
            for (int i = numOfAgents + 1; i <= numberOfAgents; i++) {
                f = false;
                for (ArrayList<Agent> l : AgentsGroups) {
                    for (Agent a : l) {
                        if (a.getId() == i) {
                            l.remove(a);
                            f = true;
                            break;
                        }
                    }
                    if (f) {
                        break;
                    }
                }
            }
        }
        setNumberOfAgents(numOfAgents);
    }

    public static void reconfigHemo(int HemoLevel) {
        // reconfig AgentsGroup according to Noun.Hemogenious
        switch (HemoLevel) {
            case 0:
                //cut all groups to gruop 1
                ArrayList<ArrayList<Agent>> temp = new ArrayList<ArrayList<Agent>>();
                ArrayList<Agent> tmp = new ArrayList<Agent>();
                for (ArrayList<Agent> l : AgentsGroups) {
                    for (Agent a : l) {
                        tmp.add(a);
                    }
                }
                temp.add(tmp);
                AgentsGroups = null;
                AgentsGroups = temp;
            case 1:
            //re-arrange simillars at the same group
            case 2:
            //add each agent to a group
        }
        setHemogenious(HemoLevel);
        UI.PropertiesAndAgentsAndTasks.Agents.AgentsTree.refreshTree();
    }

    public static ArrayList<ArrayList<Modules.Agent>> CreateListOfAgents(int numOfAgents, int HemoLevel) {
        ArrayList<ArrayList<Modules.Agent>> res = new ArrayList<>();
        switch (HemoLevel) { //0:AllHemo, 1:Groups, 2:AllHetero
            case 0:
            case 1:
                res = new ArrayList<>(1);
                ArrayList<Modules.Agent> in = new ArrayList<>(numOfAgents);
                for (int i = 0; i < numOfAgents; i++) {
                    in.add(new Modules.Agent());
                }
                res.add(in);
                break;
            case 2:
                res = new ArrayList<>(numOfAgents);
                ArrayList<Modules.Agent> in1 = null;
                for (int i = 0; i < numOfAgents; i++) {
                    in1 = new ArrayList<>(1);
                    in1.add(new Modules.Agent());
                    res.add(in1);
                }
        }
        return res;
    }
}
