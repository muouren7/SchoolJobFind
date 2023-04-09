package com.example.schooljobfind.Common.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 城市标签表(Tagscity)表实体类
 *
 * @author makejava
 * @since 2023-04-09 17:38:17
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tagscity")
public class Tagscity  {
    //城市id@TableId
    private Long cuid;

    //城市名称
    private String name;



}
