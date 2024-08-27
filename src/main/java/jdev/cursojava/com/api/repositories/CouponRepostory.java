package jdev.cursojava.com.api.repositories;

import jdev.cursojava.com.api.domain.cupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepostory extends JpaRepository<Coupon, UUID> {
}
