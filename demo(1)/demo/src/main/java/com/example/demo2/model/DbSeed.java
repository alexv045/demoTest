package com.example.demo2.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeed implements CommandLineRunner {
    private userInfoRepository userinfoRepository;

    public DbSeed(userInfoRepository userinfoRepository) {
        this.userinfoRepository = userinfoRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        userInfo john = new userInfo(
                "John123",
                "dogsncats123",
                Arrays.asList(
                        new WishList("Of mice and men",
                                 "AH1896123AVC",
                                "john1"),
                        new WishList("Harry Potter: Philosophers Stone",
                                "AX987542647",
                                "john2")
                )
        );

        userInfo ted = new userInfo(
                "ted123",
                "dogsncats123",
                Arrays.asList(
                        new WishList("LoTr",
                                "OP123Lot",
                                "Ted1" ),

                        new WishList("The Lion, the Witch and the Wardrobe",
                                "12AD412445",
                                "ted2"
                                )
                )
        );


        userInfo jim = new userInfo(
                "jim123",
                "dogsncats123",

                new ArrayList<>()

        );

        //remove all wishlists
        this.userinfoRepository.deleteAll();

        //add userinfo to db
        List<userInfo> user_info = Arrays.asList(john, ted, jim);

    }
}
