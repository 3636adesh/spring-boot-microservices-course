package com.malunjkar.domain;

import com.malunjkar.domain.models.OrderEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface OrderEventRepository extends JpaRepository<OrderEventEntity, Long> {}
