package com.ant.vo;
import lombok.Data;
 
@Data
public class BoardVO {
    int board_id;
    String userid;
    String board_title;
    String board_content;
    String board_createdata;
    String board_modifydata;
    int board_hidden;
    String MANAGER_ID;
}