package com.mattstine.dddworkshop.pizzashop.kitchen;

import lombok.Value;

@Value
final class OrderAssemblyStartedEvent implements OrderEvent {
    KitchenOrderRef ref;
}
