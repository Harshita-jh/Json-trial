//JS code try in the console in inspect to parse Json data

myJson = `{
    "name": "Harshita",
    "score": 20.95,
    "isAdmin": false,
    "license": null,
    "shopItem": ["food", "clothes", "cosmetics"],
    "myObj": {
        "name": "nestedjson",
        "marks": 25,
        "shopItem2": ["food", "clothes", {"a" : true}] 
    }
}`;
JSON.parse(myJson);
parsed = JSON.parse(myJson);
parsed["isAdmin"]
parsed["shopItem"][2]
//for nested obj
parsed = JSON.parse(myJson);
parsed["myObj"]["shopItem2"]
parsed["myObj"]["shopItem2"][2]["a"]