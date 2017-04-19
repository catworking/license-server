package cn.catwork.license.server.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by figo-007 on 2017/3/16.
 */
@Entity
@Data
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String domain;

    private Calendar create_time;

    private Calendar effective_time;

    private Calendar expire_time;

    @ManyToOne
    private Product product;

    @OneToMany(mappedBy = "license", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Instance> instances = new ArrayList<>();
}
