package com.github.boyarsky1997.task.io;

import java.io.IOException;

public class MainPerformance {
    public static void main(String[] args) throws IOException {
        long lStartTimeBufferedReading = System.currentTimeMillis();

        MyIO.bufferedReading("src\\main\\resources\\d.text");

        long lEndTimeBufferedReading = System.currentTimeMillis();

        long out = lEndTimeBufferedReading - lStartTimeBufferedReading;
        System.out.println("--------------------------------------------------------");
        System.out.println("bufferedReading: " + out);

        long lStartTimeUsualReading = System.currentTimeMillis();

        MyIO.usualReading("src\\main\\resources\\d.text");

        long lEndTimeUsualReading = System.currentTimeMillis();

        long output = lEndTimeUsualReading - lStartTimeUsualReading;
        System.out.println("--------------------------------------------------------");
        System.out.println("usualReading: " + output);

        long lStartTimeBufferedWriting = System.currentTimeMillis();
//
//        MyIO.bufferedWriting("src\\main\\resources\\t.text","They had a grandfather and a grandmother and lived to see that there was no bread. Grandfather asks:\n" +
//                "\n" +
//                "\"Grandma!\" You would bake a gingerbread man!\n" +
//                "\n" +
//                "- But why do I bake, as there is no flour?\n" +
//                "\n" +
//                "- Here, grandmother, go to the hut and sweep in the barn flour, then there will be a gingerbread man.\n" +
//                "\n" +
//                "The woman obeyed, went to the hut, swept the flour in the bin, melted it in the oven, kneaded a good flour, baked a gingerbread man and put it on the window to catch a cold.\n" +
//                "\n" +
//                "And he was lying, lying on the window, and then from the window to the porch, and from the porch to the ground in the yard, and from the yard behind the gate and ran down the road.\n" +
//                "\n" +
//                "He runs and runs along the road when a bunny meets him.\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, little bunny, I'll sing you songs:\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "Then I will run away from you!\n" +
//                "And ran again. He runs and runs ... The wolf intercepts him:\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "\"Don't eat me, little wolf, I'll sing you songs.\"\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "Then I will run away from you!\n" +
//                "And he ran ... A bear is coming.\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, bear, I'll sing you songs.\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "I ran away from the wolf,\n" +
//                "Then I will run away from you!\n" +
//                "And ran. He runs and runs on the road ... He meets a fox:\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, little fox-sister, I'll sing you songs.\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "I ran away from the wolf,\n" +
//                "He ran away from the bear,\n" +
//                "Then I will run away from you!\n" +
//                "- Well, the song is beautiful! Says the fox. \"I just can't hear a little.\" Sing again, and sit down on my tongue to make it more audible.\n" +
//                "\n" +
//                "Kolobok jumped on her tongue and began to sing:\n" +
//                "\n" +
//                "I'm swept through the silo ...\n" +
//                "And the fox - his hum! Yes, and ate!");
//
//        long lEndTimeBufferedWriting = System.currentTimeMillis();
//
//        long o = lEndTimeBufferedWriting - lStartTimeBufferedWriting;
//        System.out.println("--------------------------------------------------------");
//        System.out.println("bufferedWriting: " + o);
//
//
//        long lStartTimeUsualWriting= System.currentTimeMillis();
//
//        MyIO.usualWriting("src\\main\\resources\\k.text","They had a grandfather and a grandmother and lived to see that there was no bread. Grandfather asks:\n" +
//                "\n" +
//                "\"Grandma!\" You would bake a gingerbread man!\n" +
//                "\n" +
//                "- But why do I bake, as there is no flour?\n" +
//                "\n" +
//                "- Here, grandmother, go to the hut and sweep in the barn flour, then there will be a gingerbread man.\n" +
//                "\n" +
//                "The woman obeyed, went to the hut, swept the flour in the bin, melted it in the oven, kneaded a good flour, baked a gingerbread man and put it on the window to catch a cold.\n" +
//                "\n" +
//                "And he was lying, lying on the window, and then from the window to the porch, and from the porch to the ground in the yard, and from the yard behind the gate and ran down the road.\n" +
//                "\n" +
//                "He runs and runs along the road when a bunny meets him.\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, little bunny, I'll sing you songs:\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "Then I will run away from you!\n" +
//                "And ran again. He runs and runs ... The wolf intercepts him:\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "\"Don't eat me, little wolf, I'll sing you songs.\"\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "Then I will run away from you!\n" +
//                "And he ran ... A bear is coming.\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, bear, I'll sing you songs.\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "I ran away from the wolf,\n" +
//                "Then I will run away from you!\n" +
//                "And ran. He runs and runs on the road ... He meets a fox:\n" +
//                "\n" +
//                "- Gingerbread man, gingerbread man, I'll eat you!\n" +
//                "\n" +
//                "- Don't eat me, little fox-sister, I'll sing you songs.\n" +
//                "\n" +
//                "- Come on, sing!\n" +
//                "\n" +
//                "I'm swept across the silo,\n" +
//                "I am baked from flour, -\n" +
//                "I ran away from my grandmother,\n" +
//                "I ran away from my grandfather,\n" +
//                "I ran away from the hare,\n" +
//                "I ran away from the wolf,\n" +
//                "He ran away from the bear,\n" +
//                "Then I will run away from you!\n" +
//                "- Well, the song is beautiful! Says the fox. \"I just can't hear a little.\" Sing again, and sit down on my tongue to make it more audible.\n" +
//                "\n" +
//                "Kolobok jumped on her tongue and began to sing:\n" +
//                "\n" +
//                "I'm swept through the silo ...\n" +
//                "And the fox - his hum! Yes, and ate!");
//
//        long lEndTimeUsualWriting = System.currentTimeMillis();
//
//        long outp = lEndTimeUsualWriting - lStartTimeUsualWriting;
//        System.out.println("--------------------------------------------------------");
//        System.out.println("usualWriting: " + outp);

    }
}
