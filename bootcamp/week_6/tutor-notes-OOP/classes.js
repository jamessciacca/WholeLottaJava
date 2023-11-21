export class House {
    doorColor = '';
    family;

    constructor(stories, basement = false) {
        this.floors = stories;
        this.hasBasement = basement
    }


    getNumOfFloor() {
        let floors = this.floors
        if (this.hasBasement === true) {
            floors = floors + 1;
        }
        return floors;
    }
}

export class Mansion extends House {
    constructor(stories = 7) {
        super(stories, true);
    }
}

const byronsEstate = new Mansion();

byronsEstate.getNumOfFloor()

const byronsHouse = new House(2, true);
byronsHouse.getNumOfFloor();

const JamesHouse = new House(3);