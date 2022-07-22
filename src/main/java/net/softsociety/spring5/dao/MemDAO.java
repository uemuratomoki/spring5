package net.softsociety.spring5.dao;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.spring5.domain.Mem;

@Mapper
public interface MemDAO {

    public int joinMember(Mem m);

    public Mem idcheck(String memberid);
}
