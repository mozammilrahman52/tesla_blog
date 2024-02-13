package com.teslaBlog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name = "posts",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
@AllArgsConstructor
@NoArgsConstructor
public class Post {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   long id;
   @Column(name = "title",nullable = false)
   String title;
   @Column(name = "description",nullable = false)
   String description;
   @Column(name = "content",nullable = false)
   String content;
}
