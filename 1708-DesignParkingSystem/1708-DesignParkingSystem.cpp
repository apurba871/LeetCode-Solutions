// Last updated: 4/24/2026, 8:13:50 AM
class ParkingSystem {
public:
    int big, medium, small;
    ParkingSystem(int big, int medium, int small) {
        this->big = big;
        this->medium = medium;
        this->small = small;
    }
    
    bool addCar(int carType) {
        if (carType == 1 && big >= 1) {
            big--;
            return true;
        } else if (carType == 2 && medium >= 1) {
            medium--;
            return true;
        } else if (carType == 3 && small >= 1) {
            small--;
            return true;
        } else return false;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */