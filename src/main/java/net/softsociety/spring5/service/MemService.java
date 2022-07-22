package net.softsociety.spring5.service;

import net.softsociety.spring5.domain.Mem;

public interface MemService {

    public int joinMember(Mem m);

    public boolean idcheck(String memberid);
}
