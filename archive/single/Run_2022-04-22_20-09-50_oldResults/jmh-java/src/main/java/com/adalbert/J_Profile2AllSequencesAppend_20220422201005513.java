package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.*;

@State(Scope.Benchmark)
public class J_Profile2AllSequencesAppend_20220422201005513 {
	java.util.ArrayList<Integer> collection = new java.util.ArrayList<>();
	@Setup(Level.Invocation)
	public void setupJArraySequence() {
		collection = new java.util.ArrayList<>();
		collection.add(67);
		collection.add(19);
		collection.add(82);
		collection.add(105);
		collection.add(78);
		collection.add(63);
		collection.add(136);
		collection.add(102);
		collection.add(177);
		collection.add(179);
		collection.add(53);
		collection.add(152);
		collection.add(85);
		collection.add(198);
		collection.add(20);
		collection.add(8);
		collection.add(137);
		collection.add(183);
		collection.add(196);
		collection.add(140);
		collection.add(111);
		collection.add(86);
		collection.add(123);
		collection.add(123);
		collection.add(184);
		collection.add(129);
		collection.add(84);
		collection.add(155);
		collection.add(6);
		collection.add(98);
		collection.add(147);
		collection.add(150);
		collection.add(173);
		collection.add(72);
		collection.add(16);
		collection.add(66);
		collection.add(43);
		collection.add(72);
		collection.add(193);
		collection.add(76);
		collection.add(30);
		collection.add(99);
		collection.add(173);
		collection.add(14);
		collection.add(21);
		collection.add(83);
		collection.add(108);
		collection.add(195);
		collection.add(183);
		collection.add(63);
		collection.add(168);
		collection.add(68);
		collection.add(34);
		collection.add(181);
		collection.add(128);
		collection.add(126);
		collection.add(137);
		collection.add(46);
		collection.add(140);
		collection.add(104);
		collection.add(70);
		collection.add(151);
		collection.add(155);
		collection.add(127);
		collection.add(47);
		collection.add(188);
		collection.add(94);
		collection.add(100);
		collection.add(193);
		collection.add(101);
		collection.add(151);
		collection.add(174);
		collection.add(131);
		collection.add(42);
		collection.add(116);
		collection.add(151);
		collection.add(138);
		collection.add(46);
		collection.add(31);
		collection.add(186);
		collection.add(69);
		collection.add(91);
		collection.add(41);
		collection.add(26);
		collection.add(68);
		collection.add(40);
		collection.add(109);
		collection.add(101);
		collection.add(9);
		collection.add(37);
		collection.add(70);
		collection.add(139);
		collection.add(70);
		collection.add(136);
		collection.add(74);
		collection.add(111);
		collection.add(70);
		collection.add(190);
		collection.add(34);
		collection.add(58);
		collection.add(145);
		collection.add(21);
		collection.add(27);
		collection.add(192);
		collection.add(145);
		collection.add(87);
		collection.add(23);
		collection.add(164);
		collection.add(62);
		collection.add(177);
		collection.add(51);
		collection.add(122);
		collection.add(141);
		collection.add(88);
		collection.add(1);
		collection.add(163);
		collection.add(83);
		collection.add(7);
		collection.add(177);
		collection.add(24);
		collection.add(188);
		collection.add(25);
		collection.add(41);
		collection.add(181);
		collection.add(72);
		collection.add(99);
		collection.add(112);
		collection.add(87);
		collection.add(41);
		collection.add(130);
		collection.add(83);
		collection.add(150);
		collection.add(8);
		collection.add(133);
		collection.add(58);
		collection.add(82);
		collection.add(26);
		collection.add(118);
		collection.add(196);
		collection.add(100);
		collection.add(29);
		collection.add(186);
		collection.add(23);
		collection.add(2);
		collection.add(22);
		collection.add(168);
		collection.add(1);
		collection.add(45);
		collection.add(96);
		collection.add(186);
		collection.add(194);
		collection.add(107);
		collection.add(158);
		collection.add(24);
		collection.add(195);
		collection.add(12);
		collection.add(32);
		collection.add(102);
		collection.add(12);
		collection.add(185);
		collection.add(127);
		collection.add(110);
		collection.add(105);
		collection.add(129);
		collection.add(153);
		collection.add(43);
		collection.add(122);
		collection.add(199);
		collection.add(33);
		collection.add(87);
		collection.add(40);
		collection.add(131);
		collection.add(2);
		collection.add(62);
		collection.add(74);
		collection.add(125);
		collection.add(187);
		collection.add(194);
		collection.add(177);
		collection.add(96);
		collection.add(79);
		collection.add(36);
		collection.add(96);
		collection.add(136);
		collection.add(27);
		collection.add(150);
		collection.add(51);
		collection.add(91);
		collection.add(145);
		collection.add(99);
		collection.add(129);
		collection.add(98);
		collection.add(10);
		collection.add(47);
		collection.add(132);
		collection.add(126);
		collection.add(136);
		collection.add(54);
		collection.add(160);
		collection.add(157);
		collection.add(155);
		collection.add(144);
		collection.add(46);
		collection.add(20);
		collection.add(184);
		collection.add(16);
		collection.add(31);
		collection.add(54);
		collection.add(140);
		collection.add(9);
		collection.add(168);
		collection.add(7);
		collection.add(114);
		collection.add(166);
		collection.add(139);
		collection.add(126);
		collection.add(189);
		collection.add(109);
		collection.add(37);
		collection.add(45);
		collection.add(24);
		collection.add(191);
		collection.add(105);
		collection.add(180);
		collection.add(37);
		collection.add(39);
		collection.add(106);
		collection.add(10);
		collection.add(146);
		collection.add(19);
		collection.add(61);
		collection.add(173);
		collection.add(123);
		collection.add(17);
		collection.add(116);
		collection.add(120);
		collection.add(80);
		collection.add(66);
		collection.add(24);
		collection.add(24);
		collection.add(100);
		collection.add(133);
		collection.add(163);
		collection.add(64);
		collection.add(92);
		collection.add(41);
		collection.add(81);
		collection.add(23);
		collection.add(74);
		collection.add(105);
		collection.add(24);
		collection.add(159);
		collection.add(175);
		collection.add(59);
		collection.add(116);
		collection.add(55);
		collection.add(190);
		collection.add(138);
		collection.add(80);
		collection.add(129);
		collection.add(67);
		collection.add(128);
		collection.add(72);
		collection.add(100);
		collection.add(47);
		collection.add(24);
		collection.add(185);
		collection.add(155);
		collection.add(100);
		collection.add(118);
		collection.add(155);
		collection.add(35);
		collection.add(165);
		collection.add(10);
		collection.add(196);
		collection.add(108);
		collection.add(114);
		collection.add(156);
		collection.add(77);
		collection.add(79);
		collection.add(88);
		collection.add(48);
		collection.add(107);
		collection.add(105);
		collection.add(108);
		collection.add(26);
		collection.add(48);
		collection.add(18);
		collection.add(96);
		collection.add(18);
		collection.add(189);
		collection.add(49);
		collection.add(195);
		collection.add(8);
		collection.add(46);
		collection.add(90);
		collection.add(181);
		collection.add(26);
		collection.add(74);
		collection.add(55);
		collection.add(141);
		collection.add(139);
		collection.add(112);
		collection.add(105);
		collection.add(28);
		collection.add(69);
		collection.add(10);
		collection.add(195);
		collection.add(174);
		collection.add(151);
		collection.add(175);
		collection.add(130);
		collection.add(46);
		collection.add(167);
		collection.add(119);
		collection.add(167);
		collection.add(189);
		collection.add(143);
		collection.add(83);
		collection.add(34);
		collection.add(110);
		collection.add(1);
		collection.add(30);
		collection.add(140);
		collection.add(22);
		collection.add(95);
		collection.add(79);
		collection.add(162);
		collection.add(151);
		collection.add(64);
		collection.add(67);
		collection.add(189);
		collection.add(85);
		collection.add(64);
		collection.add(86);
		collection.add(87);
		collection.add(107);
		collection.add(92);
		collection.add(143);
		collection.add(37);
		collection.add(31);
		collection.add(37);
		collection.add(2);
		collection.add(37);
		collection.add(172);
		collection.add(69);
		collection.add(172);
		collection.add(186);
		collection.add(164);
		collection.add(12);
		collection.add(120);
		collection.add(183);
		collection.add(62);
		collection.add(167);
		collection.add(171);
		collection.add(170);
		collection.add(194);
		collection.add(143);
		collection.add(160);
		collection.add(26);
		collection.add(114);
		collection.add(65);
		collection.add(106);
		collection.add(14);
		collection.add(155);
		collection.add(103);
		collection.add(121);
		collection.add(79);
		collection.add(98);
		collection.add(57);
		collection.add(189);
		collection.add(70);
		collection.add(110);
		collection.add(10);
		collection.add(60);
		collection.add(2);
		collection.add(134);
		collection.add(102);
		collection.add(125);
		collection.add(32);
		collection.add(179);
		collection.add(85);
		collection.add(103);
		collection.add(67);
		collection.add(38);
		collection.add(85);
		collection.add(24);
		collection.add(2);
		collection.add(16);
		collection.add(58);
		collection.add(81);
		collection.add(132);
		collection.add(61);
		collection.add(134);
		collection.add(165);
		collection.add(101);
		collection.add(43);
		collection.add(71);
		collection.add(26);
		collection.add(50);
		collection.add(122);
		collection.add(41);
		collection.add(29);
		collection.add(46);
		collection.add(23);
		collection.add(70);
		collection.add(198);
		collection.add(199);
		collection.add(126);
		collection.add(72);
		collection.add(71);
		collection.add(82);
		collection.add(29);
		collection.add(185);
		collection.add(80);
		collection.add(19);
		collection.add(31);
		collection.add(147);
		collection.add(122);
		collection.add(137);
		collection.add(22);
		collection.add(90);
		collection.add(174);
		collection.add(146);
		collection.add(185);
		collection.add(195);
		collection.add(81);
		collection.add(12);
		collection.add(86);
		collection.add(6);
		collection.add(190);
		collection.add(8);
		collection.add(183);
		collection.add(197);
		collection.add(69);
		collection.add(123);
		collection.add(12);
		collection.add(153);
		collection.add(73);
		collection.add(188);
		collection.add(18);
		collection.add(185);
		collection.add(182);
		collection.add(25);
		collection.add(174);
		collection.add(3);
		collection.add(79);
		collection.add(91);
		collection.add(113);
		collection.add(173);
		collection.add(58);
		collection.add(181);
		collection.add(102);
		collection.add(10);
		collection.add(77);
		collection.add(152);
		collection.add(21);
		collection.add(182);
		collection.add(146);
		collection.add(184);
		collection.add(31);
		collection.add(97);
		collection.add(133);
		collection.add(51);
		collection.add(115);
		collection.add(108);
		collection.add(30);
		collection.add(66);
		collection.add(91);
		collection.add(86);
		collection.add(156);
		collection.add(197);
		collection.add(127);
		collection.add(139);
		collection.add(65);
		collection.add(196);
		collection.add(60);
		collection.add(97);
		collection.add(180);
		collection.add(198);
		collection.add(43);
		collection.add(120);
		collection.add(18);
		collection.add(195);
		collection.add(11);
		collection.add(94);
		collection.add(170);
		collection.add(18);
		collection.add(55);
		collection.add(198);
		collection.add(194);
		collection.add(178);
		collection.add(72);
		collection.add(88);
		collection.add(112);
		collection.add(190);
		collection.add(80);
		collection.add(59);
		collection.add(87);
		collection.add(98);
		collection.add(122);
		collection.add(148);
		collection.add(62);
		collection.add(34);
		collection.add(152);
		collection.add(12);
		collection.add(43);
		collection.add(147);
		collection.add(83);
		collection.add(157);
		collection.add(79);
		collection.add(120);
		collection.add(33);
		collection.add(55);
		collection.add(114);
		collection.add(92);
		collection.add(173);
		collection.add(82);
		collection.add(40);
		collection.add(147);
		collection.add(119);
		collection.add(91);
		collection.add(153);
		collection.add(20);
		collection.add(93);
		collection.add(13);
		collection.add(139);
		collection.add(183);
		collection.add(92);
		collection.add(8);
		collection.add(134);
		collection.add(162);
		collection.add(172);
		collection.add(7);
		collection.add(10);
		collection.add(32);
		collection.add(58);
		collection.add(77);
		collection.add(58);
		collection.add(79);
		collection.add(109);
		collection.add(167);
		collection.add(59);
		collection.add(84);
		collection.add(81);
		collection.add(154);
		collection.add(167);
		collection.add(59);
		collection.add(80);
		collection.add(38);
		collection.add(102);
		collection.add(194);
		collection.add(103);
		collection.add(24);
		collection.add(124);
		collection.add(170);
		collection.add(93);
		collection.add(144);
		collection.add(134);
		collection.add(196);
		collection.add(29);
		collection.add(176);
		collection.add(83);
		collection.add(172);
		collection.add(23);
		collection.add(51);
		collection.add(74);
		collection.add(12);
		collection.add(55);
		collection.add(77);
		collection.add(86);
		collection.add(64);
		collection.add(184);
		collection.add(162);
		collection.add(27);
		collection.add(26);
		collection.add(114);
		collection.add(60);
		collection.add(189);
		collection.add(143);
		collection.add(100);
		collection.add(145);
		collection.add(52);
		collection.add(193);
		collection.add(14);
		collection.add(72);
		collection.add(142);
		collection.add(50);
		collection.add(29);
		collection.add(72);
		collection.add(10);
		collection.add(177);
		collection.add(137);
		collection.add(66);
		collection.add(32);
		collection.add(98);
		collection.add(154);
		collection.add(120);
		collection.add(24);
		collection.add(122);
		collection.add(119);
		collection.add(34);
		collection.add(126);
		collection.add(46);
		collection.add(58);
		collection.add(143);
		collection.add(154);
		collection.add(52);
		collection.add(106);
		collection.add(79);
		collection.add(172);
		collection.add(88);
		collection.add(147);
		collection.add(185);
		collection.add(38);
		collection.add(132);
		collection.add(50);
		collection.add(50);
		collection.add(166);
		collection.add(52);
		collection.add(89);
		collection.add(42);
		collection.add(95);
		collection.add(113);
		collection.add(143);
		collection.add(142);
		collection.add(24);
		collection.add(171);
		collection.add(28);
		collection.add(138);
		collection.add(71);
		collection.add(3);
		collection.add(192);
		collection.add(120);
		collection.add(71);
		collection.add(117);
		collection.add(50);
		collection.add(2);
		collection.add(99);
		collection.add(101);
		collection.add(152);
		collection.add(38);
		collection.add(20);
		collection.add(19);
		collection.add(26);
		collection.add(166);
		collection.add(48);
		collection.add(129);
		collection.add(41);
		collection.add(57);
		collection.add(89);
		collection.add(45);
		collection.add(76);
		collection.add(134);
		collection.add(80);
		collection.add(190);
		collection.add(63);
		collection.add(22);
		collection.add(100);
		collection.add(27);
		collection.add(184);
		collection.add(126);
		collection.add(60);
		collection.add(10);
		collection.add(38);
		collection.add(146);
		collection.add(30);
		collection.add(96);
		collection.add(73);
		collection.add(71);
		collection.add(111);
		collection.add(35);
		collection.add(167);
		collection.add(1);
		collection.add(187);
		collection.add(127);
		collection.add(27);
		collection.add(119);
		collection.add(8);
		collection.add(33);
		collection.add(39);
		collection.add(176);
		collection.add(179);
		collection.add(42);
		collection.add(189);
		collection.add(77);
		collection.add(69);
		collection.add(35);
		collection.add(52);
		collection.add(138);
		collection.add(148);
		collection.add(183);
		collection.add(134);
		collection.add(51);
		collection.add(97);
		collection.add(186);
		collection.add(100);
		collection.add(27);
		collection.add(121);
		collection.add(58);
		collection.add(17);
		collection.add(122);
		collection.add(47);
		collection.add(128);
		collection.add(48);
		collection.add(143);
		collection.add(8);
		collection.add(142);
		collection.add(49);
		collection.add(169);
		collection.add(123);
		collection.add(126);
		collection.add(14);
		collection.add(46);
		collection.add(48);
		collection.add(81);
		collection.add(118);
		collection.add(185);
		collection.add(90);
		collection.add(44);
		collection.add(34);
		collection.add(196);
		collection.add(119);
		collection.add(53);
		collection.add(9);
		collection.add(70);
		collection.add(140);
		collection.add(176);
		collection.add(112);
		collection.add(160);
		collection.add(96);
		collection.add(83);
		collection.add(8);
		collection.add(164);
		collection.add(131);
		collection.add(40);
		collection.add(49);
		collection.add(158);
		collection.add(82);
		collection.add(144);
		collection.add(65);
		collection.add(157);
		collection.add(132);
		collection.add(82);
		collection.add(110);
		collection.add(154);
		collection.add(148);
		collection.add(48);
		collection.add(102);
		collection.add(163);
		collection.add(120);
		collection.add(114);
		collection.add(8);
		collection.add(197);
		collection.add(143);
		collection.add(74);
		collection.add(184);
		collection.add(161);
		collection.add(21);
		collection.add(145);
		collection.add(134);
		collection.add(138);
		collection.add(40);
		collection.add(40);
		collection.add(135);
		collection.add(135);
		collection.add(102);
		collection.add(63);
		collection.add(22);
		collection.add(14);
		collection.add(162);
		collection.add(8);
		collection.add(142);
		collection.add(122);
		collection.add(94);
		collection.add(121);
		collection.add(193);
		collection.add(174);
		collection.add(13);
		collection.add(142);
		collection.add(80);
		collection.add(26);
		collection.add(156);
		collection.add(93);
		collection.add(4);
		collection.add(12);
		collection.add(144);
		collection.add(87);
		collection.add(75);
		collection.add(46);
		collection.add(144);
		collection.add(39);
		collection.add(174);
		collection.add(16);
		collection.add(188);
		collection.add(5);
		collection.add(113);
		collection.add(64);
		collection.add(133);
		collection.add(32);
		collection.add(86);
		collection.add(88);
		collection.add(189);
		collection.add(5);
		collection.add(164);
		collection.add(16);
		collection.add(161);
		collection.add(64);
		collection.add(96);
		collection.add(19);
		collection.add(15);
		collection.add(101);
		collection.add(40);
		collection.add(73);
		collection.add(89);
		collection.add(45);
		collection.add(76);
		collection.add(120);
		collection.add(121);
		collection.add(106);
		collection.add(68);
		collection.add(39);
		collection.add(16);
		collection.add(17);
		collection.add(141);
		collection.add(128);
		collection.add(64);
		collection.add(40);
		collection.add(71);
		collection.add(51);
		collection.add(154);
		collection.add(49);
		collection.add(170);
		collection.add(95);
		collection.add(47);
		collection.add(182);
		collection.add(105);
		collection.add(27);
		collection.add(193);
		collection.add(96);
		collection.add(88);
		collection.add(152);
		collection.add(90);
		collection.add(83);
		collection.add(74);
		collection.add(81);
		collection.add(181);
		collection.add(117);
		collection.add(190);
		collection.add(29);
		collection.add(128);
		collection.add(46);
		collection.add(51);
		collection.add(45);
		collection.add(190);
		collection.add(110);
		collection.add(105);
		collection.add(76);
		collection.add(179);
		collection.add(85);
		collection.add(156);
		collection.add(199);
		collection.add(43);
		collection.add(20);
		collection.add(74);
		collection.add(12);
		collection.add(125);
		collection.add(74);
		collection.add(19);
		collection.add(168);
		collection.add(88);
		collection.add(171);
		collection.add(160);
		collection.add(104);
		collection.add(19);
		collection.add(63);
		collection.add(93);
		collection.add(81);
		collection.add(167);
		collection.add(130);
		collection.add(173);
		collection.add(17);
		collection.add(116);
		collection.add(138);
		collection.add(136);
		collection.add(25);
		collection.add(46);
		collection.add(31);
		collection.add(199);
		collection.add(179);
		collection.add(52);
		collection.add(48);
		collection.add(171);
		collection.add(4);
		collection.add(196);
		collection.add(32);
		collection.add(21);
		collection.add(58);
		collection.add(44);
		collection.add(21);
		collection.add(178);
		collection.add(138);
		collection.add(157);
		collection.add(120);
		collection.add(106);
		collection.add(161);
		collection.add(192);
		collection.add(62);
		collection.add(15);
		collection.add(62);
		collection.add(153);
		collection.add(185);
		collection.add(96);
		collection.add(85);
		collection.add(169);
		collection.add(146);
		collection.add(45);
		collection.add(158);
		collection.add(83);
		collection.add(120);
		collection.add(117);
		collection.add(165);
		collection.add(53);
		collection.add(122);
		collection.add(122);
		collection.add(154);
		collection.add(130);
		collection.add(29);
		collection.add(58);
		collection.add(18);
		collection.add(185);
		collection.add(161);
		collection.add(151);
		collection.add(107);
		collection.add(160);
		collection.add(157);
		collection.add(135);
		collection.add(12);
		collection.add(29);
		collection.add(188);
		collection.add(182);
		collection.add(132);
		collection.add(172);
		collection.add(190);
		collection.add(67);
		collection.add(114);
		collection.add(143);
		collection.add(132);
		collection.add(142);
		collection.add(87);
		collection.add(144);
		collection.add(40);
		collection.add(111);
		collection.add(121);
		collection.add(177);
		collection.add(164);
		collection.add(191);
		collection.add(54);
		collection.add(142);
		collection.add(70);
		collection.add(176);
		collection.add(30);
		collection.add(144);
		collection.add(93);
		collection.add(89);
		collection.add(154);
		collection.add(132);
		collection.add(191);
		collection.add(9);
		collection.add(192);
		collection.add(28);
		collection.add(151);
		collection.add(91);
		collection.add(95);
		collection.add(190);
		collection.add(82);
		collection.add(93);
		collection.add(38);
		collection.add(180);
		collection.add(162);
		collection.add(135);
		collection.add(95);
		collection.add(143);
		collection.add(134);
		collection.add(99);
		collection.add(180);
		collection.add(9);
		collection.add(113);
		collection.add(28);
		collection.add(165);
		collection.add(157);
		collection.add(10);
		collection.add(21);
		collection.add(105);
		collection.add(189);
		collection.add(144);
		collection.add(148);
		collection.add(161);
		collection.add(45);
		collection.add(193);
		collection.add(3);
		collection.add(84);
		collection.add(87);
		collection.add(67);
		collection.add(48);
		collection.add(157);
		collection.add(42);
		collection.add(39);
		collection.add(115);
		collection.add(78);
		collection.add(142);
		collection.add(109);
		collection.add(169);
		collection.add(115);
		collection.add(116);
		collection.add(179);
		collection.add(89);
		collection.add(23);
		collection.add(118);
		collection.add(10);
		collection.add(121);
		collection.add(155);
		collection.add(138);
		collection.add(63);
		collection.add(162);
		collection.add(97);
		collection.add(8);
		collection.add(71);
		collection.add(170);
		collection.add(37);
		collection.add(190);
		collection.add(98);
		collection.add(141);
		collection.add(127);
		collection.add(166);
		collection.add(47);
		collection.add(99);
		collection.add(8);
		collection.add(53);
		collection.add(164);
		collection.add(87);
		collection.add(137);
		collection.add(178);
		collection.add(159);
		collection.add(65);
		collection.add(56);
		collection.add(123);
		collection.add(160);
		collection.add(182);
		collection.add(33);
		collection.add(20);
		collection.add(118);
		collection.add(19);
		collection.add(135);
		collection.add(155);
		collection.add(169);
		collection.add(6);
		collection.add(194);
		collection.add(198);
		collection.add(190);
		collection.add(72);
		collection.add(125);
		collection.add(47);
		collection.add(43);
		collection.add(1);
		collection.add(133);
		collection.add(182);
		collection.add(106);
		collection.add(141);
		collection.add(69);
		collection.add(114);
		collection.add(11);
		collection.add(111);
		collection.add(33);
		collection.add(147);
		collection.add(39);
		collection.add(51);
		collection.add(146);
		collection.add(55);
		collection.add(100);
		collection.add(77);
		collection.add(125);
		collection.add(82);
		collection.add(61);
		collection.add(145);
		collection.add(193);
		collection.add(67);
		collection.add(170);
		collection.add(124);
		collection.add(105);
		collection.add(160);
		collection.add(188);
		collection.add(22);
		collection.add(84);
		collection.add(177);
		collection.add(22);
		collection.add(3);
		collection.add(102);
		collection.add(189);
		collection.add(167);
		collection.add(77);
		collection.add(139);
		collection.add(165);
		collection.add(101);
		collection.add(8);
		collection.add(166);
		collection.add(141);
		collection.add(97);
		collection.add(185);
		collection.add(137);
		collection.add(75);
		collection.add(107);
		collection.add(148);
		collection.add(126);
		collection.add(57);
		collection.add(58);
		collection.add(113);
		collection.add(8);
		collection.add(112);
		collection.add(46);
		collection.add(106);
		collection.add(196);
		collection.add(163);
		collection.add(67);
		collection.add(113);
		collection.add(36);
		collection.add(71);
		collection.add(117);
		collection.add(6);
		collection.add(56);
		collection.add(125);
		collection.add(61);
		collection.add(187);
		collection.add(72);
		collection.add(43);
		collection.add(46);
		collection.add(13);
		collection.add(7);
		collection.add(23);
		collection.add(189);
		collection.add(42);
		collection.add(175);
		collection.add(111);
		collection.add(161);
		collection.add(131);
		collection.add(107);
		collection.add(39);
		collection.add(72);
		collection.add(3);
		collection.add(160);
		collection.add(181);
		collection.add(134);
		collection.add(181);
		collection.add(63);
		collection.add(86);
		collection.add(14);
		collection.add(9);
		collection.add(121);
		collection.add(160);
		collection.add(71);
		collection.add(84);
		collection.add(105);
		collection.add(193);
		collection.add(33);
		collection.add(49);
		collection.add(37);
		collection.add(59);
		collection.add(165);
		collection.add(177);
		collection.add(172);
		collection.add(78);
		collection.add(3);
		collection.add(63);
		collection.add(119);
		collection.add(121);
		collection.add(166);
		collection.add(22);
		collection.add(157);
		collection.add(79);
		collection.add(175);
		collection.add(63);
		collection.add(4);
		collection.add(44);
		collection.add(31);
		collection.add(82);
		collection.add(22);
		collection.add(91);
		collection.add(62);
		collection.add(23);
		collection.add(19);
		collection.add(147);
		collection.add(31);
		collection.add(76);
		collection.add(44);
		collection.add(177);
		collection.add(106);
		collection.add(176);
		collection.add(63);
		collection.add(56);
		collection.add(98);
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=3)
	@Measurement(time=3,iterations=30)
	public void JArraySequence(Blackhole bh) {
		collection.add(163);
		collection.add(94);
		collection.add(138);
		collection.add(4);
		collection.add(105);
		collection.add(164);
		collection.add(187);
		collection.add(46);
		collection.add(89);
		collection.add(157);
		collection.add(164);
		collection.add(149);
		collection.add(106);
		collection.add(155);
		collection.add(68);
		collection.add(6);
		collection.add(171);
		collection.add(169);
		collection.add(134);
		collection.add(175);
		collection.add(39);
		collection.add(15);
		collection.add(194);
		collection.add(102);
		collection.add(91);
		collection.add(176);
		collection.add(28);
		collection.add(175);
		collection.add(72);
		collection.add(101);
		collection.add(152);
		collection.add(175);
		collection.add(133);
		collection.add(59);
		collection.add(171);
		collection.add(11);
		collection.add(116);
		collection.add(118);
		collection.add(149);
		collection.add(171);
		collection.add(188);
		collection.add(185);
		collection.add(176);
		collection.add(115);
		collection.add(157);
		collection.add(105);
		collection.add(152);
		collection.add(189);
		collection.add(81);
		collection.add(46);
		collection.add(75);
		collection.add(186);
		collection.add(104);
		collection.add(66);
		collection.add(178);
		collection.add(66);
		collection.add(180);
		collection.add(65);
		collection.add(60);
		collection.add(46);
		collection.add(89);
		collection.add(189);
		collection.add(109);
		collection.add(24);
		collection.add(186);
		collection.add(60);
		collection.add(43);
		collection.add(63);
		collection.add(174);
		collection.add(158);
		collection.add(38);
		collection.add(172);
		collection.add(90);
		collection.add(167);
		collection.add(165);
		collection.add(61);
		collection.add(119);
		collection.add(128);
		collection.add(132);
		collection.add(48);
		collection.add(186);
		collection.add(19);
		collection.add(195);
		collection.add(75);
		collection.add(21);
		collection.add(73);
		collection.add(103);
		collection.add(76);
		collection.add(128);
		collection.add(106);
		collection.add(183);
		collection.add(133);
		collection.add(193);
		collection.add(186);
		collection.add(186);
		collection.add(30);
		collection.add(12);
		collection.add(32);
		collection.add(132);
		collection.add(164);
		collection.add(120);
		collection.add(199);
		collection.add(41);
		collection.add(131);
		collection.add(143);
		collection.add(187);
		collection.add(127);
		collection.add(197);
		collection.add(50);
		collection.add(84);
		collection.add(122);
		collection.add(95);
		collection.add(111);
		collection.add(17);
		collection.add(75);
		collection.add(169);
		collection.add(128);
		collection.add(90);
		collection.add(161);
		collection.add(118);
		collection.add(37);
		collection.add(93);
		collection.add(94);
		collection.add(60);
		collection.add(98);
		collection.add(54);
		collection.add(72);
		collection.add(177);
		collection.add(199);
		collection.add(75);
		collection.add(153);
		collection.add(74);
		collection.add(132);
		collection.add(41);
		collection.add(74);
		collection.add(9);
		collection.add(131);
		collection.add(124);
		collection.add(81);
		collection.add(126);
		collection.add(23);
		collection.add(134);
		collection.add(68);
		collection.add(107);
		collection.add(179);
		collection.add(193);
		collection.add(122);
		collection.add(96);
		collection.add(81);
		collection.add(17);
		collection.add(96);
		collection.add(33);
		collection.add(100);
		collection.add(167);
		collection.add(142);
		collection.add(170);
		collection.add(98);
		collection.add(139);
		collection.add(132);
		collection.add(141);
		collection.add(185);
		collection.add(36);
		collection.add(95);
		collection.add(191);
		collection.add(166);
		collection.add(51);
		collection.add(6);
		collection.add(162);
		collection.add(45);
		collection.add(182);
		collection.add(108);
		collection.add(152);
		collection.add(36);
		collection.add(129);
		collection.add(100);
		collection.add(27);
		collection.add(48);
		collection.add(108);
		collection.add(23);
		collection.add(35);
		collection.add(137);
		collection.add(18);
		collection.add(185);
		collection.add(86);
		collection.add(20);
		collection.add(182);
		collection.add(187);
		collection.add(164);
		collection.add(99);
		collection.add(173);
		collection.add(71);
		collection.add(143);
		collection.add(111);
		collection.add(129);
		collection.add(163);
		collection.add(85);
		collection.add(105);
		collection.add(148);
		collection.add(13);
		collection.add(178);
		collection.add(61);
		collection.add(98);
		collection.add(50);
		collection.add(170);
		collection.add(40);
		collection.add(72);
		collection.add(56);
		collection.add(11);
		collection.add(124);
		collection.add(76);
		collection.add(110);
		collection.add(114);
		collection.add(42);
		collection.add(179);
		collection.add(2);
		collection.add(149);
		collection.add(123);
		collection.add(147);
		collection.add(66);
		collection.add(139);
		collection.add(62);
		collection.add(28);
		collection.add(143);
		collection.add(95);
		collection.add(84);
		collection.add(67);
		collection.add(127);
		collection.add(37);
		collection.add(59);
		collection.add(125);
		collection.add(7);
		collection.add(139);
		collection.add(87);
		collection.add(134);
		collection.add(52);
		collection.add(73);
		collection.add(182);
		collection.add(177);
		collection.add(75);
		collection.add(83);
		collection.add(23);
		collection.add(177);
		collection.add(59);
		collection.add(136);
		collection.add(118);
		collection.add(112);
		collection.add(85);
		collection.add(81);
		collection.add(96);
		collection.add(121);
		collection.add(13);
		collection.add(57);
		collection.add(160);
		collection.add(57);
		collection.add(110);
		collection.add(31);
		collection.add(185);
		collection.add(157);
		collection.add(25);
		collection.add(147);
		collection.add(195);
		collection.add(2);
		collection.add(168);
		collection.add(12);
		collection.add(107);
		collection.add(13);
		collection.add(76);
		collection.add(134);
		collection.add(19);
		collection.add(70);
		collection.add(122);
		collection.add(71);
		collection.add(11);
		collection.add(2);
		collection.add(152);
		collection.add(84);
		collection.add(36);
		collection.add(151);
		collection.add(188);
		collection.add(32);
		collection.add(63);
		collection.add(23);
		collection.add(196);
		collection.add(99);
		collection.add(2);
		collection.add(33);
		collection.add(154);
		collection.add(118);
		collection.add(51);
		collection.add(70);
		collection.add(184);
		collection.add(118);
		collection.add(184);
		collection.add(126);
		collection.add(121);
		collection.add(182);
		collection.add(174);
		collection.add(70);
		collection.add(13);
		collection.add(24);
		collection.add(119);
		collection.add(138);
		collection.add(162);
		collection.add(157);
		collection.add(1);
		collection.add(45);
		collection.add(47);
		collection.add(19);
		collection.add(96);
		collection.add(28);
		collection.add(117);
		collection.add(163);
		collection.add(167);
		collection.add(179);
		collection.add(41);
		collection.add(56);
		collection.add(13);
		collection.add(20);
		collection.add(49);
		collection.add(84);
		collection.add(185);
		collection.add(61);
		collection.add(189);
		collection.add(79);
		collection.add(33);
		collection.add(191);
		collection.add(164);
		collection.add(97);
		collection.add(63);
		collection.add(199);
		collection.add(161);
		collection.add(192);
		collection.add(102);
		collection.add(167);
		collection.add(133);
		collection.add(10);
		collection.add(41);
		collection.add(50);
		collection.add(52);
		collection.add(72);
		collection.add(118);
		collection.add(115);
		collection.add(49);
		collection.add(181);
		collection.add(146);
		collection.add(141);
		collection.add(188);
		collection.add(24);
		collection.add(168);
		collection.add(199);
		collection.add(44);
		collection.add(33);
		collection.add(168);
		collection.add(155);
		collection.add(165);
		collection.add(161);
		collection.add(39);
		collection.add(46);
		collection.add(100);
		collection.add(178);
		collection.add(163);
		collection.add(128);
		collection.add(157);
		collection.add(196);
		collection.add(33);
		collection.add(177);
		collection.add(162);
		collection.add(26);
		collection.add(165);
		collection.add(121);
		collection.add(125);
		collection.add(109);
		collection.add(116);
		collection.add(155);
		collection.add(125);
		collection.add(183);
		collection.add(136);
		collection.add(172);
		collection.add(194);
		collection.add(132);
		collection.add(26);
		collection.add(96);
		collection.add(183);
		collection.add(188);
		collection.add(97);
		collection.add(23);
		collection.add(161);
		collection.add(106);
		collection.add(3);
		collection.add(87);
		collection.add(12);
		collection.add(148);
		collection.add(34);
		collection.add(18);
		collection.add(179);
		collection.add(197);
		collection.add(135);
		collection.add(118);
		collection.add(185);
		collection.add(178);
		collection.add(135);
		collection.add(14);
		collection.add(193);
		collection.add(45);
		collection.add(136);
		collection.add(109);
		collection.add(92);
		collection.add(49);
		collection.add(97);
		collection.add(117);
		collection.add(160);
		collection.add(42);
		collection.add(100);
		collection.add(165);
		collection.add(132);
		collection.add(20);
		collection.add(25);
		collection.add(100);
		collection.add(145);
		collection.add(107);
		collection.add(164);
		collection.add(163);
		collection.add(31);
		collection.add(36);
		collection.add(66);
		collection.add(67);
		collection.add(17);
		collection.add(26);
		collection.add(179);
		collection.add(58);
		collection.add(40);
		collection.add(190);
		collection.add(93);
		collection.add(129);
		collection.add(77);
		collection.add(118);
		collection.add(73);
		collection.add(28);
		collection.add(187);
		collection.add(167);
		collection.add(168);
		collection.add(98);
		collection.add(51);
		collection.add(26);
		collection.add(36);
		collection.add(51);
		collection.add(111);
		collection.add(122);
		collection.add(159);
		collection.add(184);
		collection.add(176);
		collection.add(42);
		collection.add(104);
		collection.add(48);
		collection.add(163);
		collection.add(64);
		collection.add(189);
		collection.add(14);
		collection.add(45);
		collection.add(189);
		collection.add(143);
		collection.add(84);
		collection.add(59);
		collection.add(145);
		collection.add(33);
		collection.add(13);
		collection.add(192);
		collection.add(61);
		collection.add(44);
		collection.add(29);
		collection.add(24);
		collection.add(28);
		collection.add(53);
		collection.add(49);
		collection.add(140);
		collection.add(88);
		collection.add(75);
		collection.add(7);
		collection.add(98);
		collection.add(146);
		collection.add(156);
		collection.add(123);
		collection.add(165);
		collection.add(126);
		collection.add(151);
		collection.add(24);
		collection.add(117);
		collection.add(181);
		collection.add(104);
		collection.add(155);
		collection.add(118);
		collection.add(175);
		collection.add(109);
		collection.add(126);
		collection.add(115);
		collection.add(57);
		collection.add(114);
		collection.add(56);
		collection.add(35);
		collection.add(29);
	}
}
