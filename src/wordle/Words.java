package wordle;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Words {
    private static Words words = new Words();
    private static final String[] wordList = {
            "Abuse",
            "Adult",
            "Agent",
            "Anger",
            "Apple",
            "Award",
            "Basis",
            "Beach",
            "Birth",
            "Block",
            "Blood",
            "Board",
            "Brain",
            "Bread",
            "Break",
            "Brown",
            "Buyer",
            "Cause",
            "Chain",
            "Chair",
            "Chest",
            "Chief",
            "Child",
            "China",
            "Claim",
            "Class",
            "Clock",
            "Coach",
            "Coast",
            "Court",
            "Cover",
            "Cream",
            "Crime",
            "Cross",
            "Crowd",
            "Crown",
            "Cycle",
            "Dance",
            "Death",
            "Depth",
            "Doubt",
            "Draft",
            "Drama",
            "Dream",
            "Dress",
            "Drink",
            "Drive",
            "Earth",
            "Enemy",
            "Entry",
            "Error",
            "Event",
            "Faith",
            "Fault",
            "Field",
            "Fight",
            "Final",
            "Floor",
            "Focus",
            "Force",
            "Frame",
            "Frank",
            "Front",
            "Fruit",
            "Glass",
            "Grant",
            "Grass",
            "Green",
            "Group",
            "Guide",
            "Heart",
            "Henry",
            "Horse",
            "Hotel",
            "House",
            "Image",
            "Index",
            "Input",
            "Issue",
            "Japan",
            "Jones",
            "Judge",
            "Knife",
            "Laura",
            "Layer",
            "Level",
            "Lewis",
            "Light",
            "Limit",
            "Lunch",
            "Major",
            "March",
            "Match",
            "Metal",
            "Model",
            "Money",
            "Month",
            "Motor",
            "Mouth",
            "Music",
            "Night",
            "Noise",
            "North",
            "Novel",
            "Nurse",
            "Offer",
            "Order",
            "Other",
            "Owner",
            "Panel",
            "Paper",
            "Party",
            "Peace",
            "Peter",
            "Phase",
            "Phone",
            "Piece",
            "Pilot",
            "Pitch",
            "Place",
            "Plane",
            "Plant",
            "Plate",
            "Point",
            "Pound",
            "Power",
            "Press",
            "Price",
            "Pride",
            "Prize",
            "Proof",
            "Queen",
            "Radio",
            "Range",
            "Ratio",
            "Reply",
            "Right",
            "River",
            "Round",
            "Route",
            "Rugby",
            "Scale",
            "Scene",
            "Scope",
            "Score",
            "Sense",
            "Shape",
            "Share",
            "Sheep",
            "Sheet",
            "Shift",
            "Shirt",
            "Shock",
            "Sight",
            "Simon",
            "Skill",
            "Sleep",
            "Smile",
            "Smith",
            "Smoke",
            "Sound",
            "South",
            "Space",
            "Speed",
            "Spite",
            "Sport",
            "Squad",
            "Staff",
            "Stage",
            "Start",
            "State",
            "Steam",
            "Steel",
            "Stock",
            "Stone",
            "Store",
            "Study",
            "Stuff",
            "Style",
            "Sugar",
            "Table",
            "Taste",
            "Terry",
            "Theme",
            "Thing",
            "Title",
            "Total",
            "Touch",
            "Tower",
            "Track",
            "Trade",
            "Train",
            "Trend",
            "Trial",
            "Trust",
            "Truth",
            "Uncle",
            "Union",
            "Unity",
            "Value",
            "Video",
            "Visit",
            "Voice",
            "Waste",
            "Watch",
            "Water",
            "While",
            "White",
            "Whole",
            "Woman",
            "World",
            "Youth"
    };

    private static Map<Integer, String> map = new HashMap<Integer, String>();

    public static void setup() {
        int count = 0;
        for (String string : wordList) {
            map.put(count, string.toLowerCase());
            count++;
        }
    }

    public static String getWord() {
        return wordList[(int)((Math.random()*(wordList.length))+1)];
    }

    public static boolean checkWord(String str) {
        return map.containsValue(str);
    }
}