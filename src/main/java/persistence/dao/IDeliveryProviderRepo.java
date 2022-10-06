package persistence.dao;

import persistence.models.DeliveryProvider;

import java.util.List;

public interface IDeliveryProviderRepo {


    DeliveryProvider findById(int id);

    //read
    List<DeliveryProvider> findAll();
}
