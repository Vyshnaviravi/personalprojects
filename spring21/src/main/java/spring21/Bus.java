package spring21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {

    // ================= FIELD / "VECTOR" INJECTION =================
    // @Autowired
    // Wheel wheel;

    
    // ================= SETTER INJECTION =================
    // Wheel wheel;
    //
    // @Autowired
    // public void setWheel(Wheel wheel) {
    //     this.wheel = wheel;
    // }


    // ================= CONSTRUCTOR INJECTION (ACTIVE) =================
    Wheel wheel;

    @Autowired
    public Bus(Wheel wheel) {
        this.wheel = wheel;
    }


    // ================= COMMON METHOD =================
    public void test() {
        wheel.assembly();
    }
}f