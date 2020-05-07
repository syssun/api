package com.sys.api.modules.envapi.dao;

import com.sys.api.modules.envapi.beans.Vaddress;
import java.util.List;

public interface VaddressMapper {
    int insert(Vaddress record);

    List<Vaddress> selectAll();
}