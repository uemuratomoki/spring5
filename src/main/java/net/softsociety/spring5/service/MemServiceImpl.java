package net.softsociety.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring5.dao.MemDAO;
import net.softsociety.spring5.domain.Mem;

@Slf4j
@Service
public class MemServiceImpl implements MemService {

    @Autowired
    private MemDAO memDAO;

    @Override
    public int joinMember(Mem m) {
        int result = memDAO.joinMember(m);
        log.debug("출력결과{}:", m);

        return result;

    }

    @Override
    public boolean idcheck(String memberid) {
        log.debug("memberid{}", memberid);
        Mem m = memDAO.idcheck(memberid);
        log.debug("멤버가 있나요 {}", m);
        if (m == null) {
            return true;
        } else {
            return false;
        }
    }

}
