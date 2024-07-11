package gift.repository;

import gift.dto.WishResponse;
import gift.model.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish, Long> {
    List<Wish> findByMemberId(Long memberId);
    Page<Wish> findByMemberId(Long memberId, Pageable pageable);
}