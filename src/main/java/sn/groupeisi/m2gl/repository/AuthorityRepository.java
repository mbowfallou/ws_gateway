package sn.groupeisi.m2gl.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import sn.groupeisi.m2gl.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
