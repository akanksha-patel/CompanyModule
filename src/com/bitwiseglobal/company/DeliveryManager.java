package com.bitwiseglobal.company;

class DeliveryManager {
    private final int dmId;
    private final String deliveryManagerName;

// --Commented out by Inspection START (8/22/2016 6:33 PM):
//    DeliveryManager(){
//
//    }
// --Commented out by Inspection STOP (8/22/2016 6:33 PM)

    DeliveryManager(int dmId,String deliveryManagerName){
        this.dmId = dmId;
        this.deliveryManagerName = deliveryManagerName;
    }

    public int getDmId() {
        return dmId;
    }

// --Commented out by Inspection START (8/22/2016 6:33 PM):
//    public void setDmId(int dmId) {
//        this.dmId = dmId;
//    }
// --Commented out by Inspection STOP (8/22/2016 6:33 PM)

    public String getDeliveryManagerName() {
        return deliveryManagerName;
    }

// --Commented out by Inspection START (8/22/2016 6:33 PM):
//    public void setDeliveryManagerName(String deliveryManagerName) {
//        this.deliveryManagerName = deliveryManagerName;
//    }
// --Commented out by Inspection STOP (8/22/2016 6:33 PM)


}
