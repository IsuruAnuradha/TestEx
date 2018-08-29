package com.singtel.singtelexcersice;

import com.singtel.singtelexcersice.model.animal.Animal;
import com.singtel.singtelexcersice.model.animal.bird.*;
import com.singtel.singtelexcersice.model.animal.bird.parrot.Parrot;
import com.singtel.singtelexcersice.model.animal.fish.Clownfish;
import com.singtel.singtelexcersice.model.animal.fish.Dolphin;
import com.singtel.singtelexcersice.model.animal.fish.Fish;
import com.singtel.singtelexcersice.model.animal.fish.Shark;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelexcersiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelexcersiceApplication.class, args);

		Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Butterfly(),
                new Dolphin(),
		};
	}
}
