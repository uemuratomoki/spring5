package net.softsociety.spring5.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mem {
    String memberid;
    String memberpw;
    String membername;
    String email;
    String phone;
    String address;

}
