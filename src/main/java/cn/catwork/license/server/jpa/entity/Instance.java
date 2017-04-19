package cn.catwork.license.server.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by figo-007 on 2017/3/16.
 */
@Entity
@Data
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 255)
    private String ip;

    private Calendar create_time;

    private Calendar last_communicate_time;

    private Calendar communicate_times;

    @ManyToOne
    private License license;
}
