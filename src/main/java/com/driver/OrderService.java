package com.driver;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    OrderRepository repo = new OrderRepository();


    public void addOrder(Order order){
        repo.addOrder(order);
    }

    public void addPartner(String partnerId){
        repo.addPartner(partnerId);
    }

    public void addOrderPartnerPair(String orderId, String partnerId){
        repo.addOrderPartnerPair(orderId,partnerId);
    }

    public Order getOrderById(String orderId){
        return repo.getOrderById(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId){
        return repo.getPartnerById(partnerId);
    }

    public int getOrderCountByPartnerId(String partnerId){
        return repo.getOrderCountByPartnerId(partnerId);
    }

    public List<String> getOrdersByPartnerId(String partnerId){
        return repo.getOrdersByPartnerId(partnerId);
    }

    public List<String> getAllOrders() {
        return repo.getAllOrders();
    }

    public int getCountOfUnassignedOrders(){
        return repo.getCountOfUnassignedOrders();
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId){
        return repo.getOrdersLeftAfterGivenTimeByPartnerId(time,partnerId);
    }

    public String getLastDeliveryTimeByPartnerId(String partnerId){
        return repo.getLastDeliveryTimeByPartnerId(partnerId);



    }

    public void deletePartnerById(String partnerId){
        repo.deletePartnerById(partnerId);
    }

    public void deleteOrderById(String orderId){
        repo.deleteOrderById(orderId);
    }
}
