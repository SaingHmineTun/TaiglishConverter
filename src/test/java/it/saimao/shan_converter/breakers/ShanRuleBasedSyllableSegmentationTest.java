package it.saimao.shan_converter.breakers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShanRuleBasedSyllableSegmentationTest {

    @Test
    void segment() {
        String input = "7. 2. 1947 ၼီႈၼႆႉ ပဵၼ်ဝၼ်းလၢၵ်ႈလၢႆးလူင်ဝၼ်းၼိူင်ႈ ၼႂ်းပိုၼ်းတႆးပၢၼ်မႂ်ႇ။ ပဵၼ်ဝၼ်းဢၼ်တင်ႈလၵ်းထၢၼ်သၢၵ်ႈသေႇ ဢၼ်ၸႅင်ႈၼႄလႆႈဝႃႈ တႆးပဵၼ်ၸိူဝ်ႉၶိူဝ်းလူင်ဢၼ်ၼိူင်ႈ ဢၼ်ႁူႉပွင်ႇလွင်ႈၵၢၼ်မိူင်းၸိူဝ်ႉၸၢတ်ႈ။ ပဵၼ်ဝၼ်းပိူင်းၼႄဝႃႈ တႆးမီးၸိူဝ်ႉမီးၶိူဝ်း၊ မီးမၢၼ်ႈမီးမိူင်း၊ ပဵၼ်ၸိူဝ်ႉၶိူဝ်းမေႃၽွမ်ႉႁူမ်ႈ ဢၼ်တႄႇတင်ႈလႆႈၸိုင်ႈမိူင်း၊ မီးလူင်ပွင်ႊၸိုင်ႈ၊ မီးတုင်းၸိူဝ်ႉၸၢတ်ႈၸွမ်ပိဝ်ၸိုင်ႈမိူင်း၊ မီးၽဵင်းၵႂၢမ်းၸွမ်ပိဝ်တုင်းၸိူဝ်ႉၸၢတ်ႈၶေႃၶေႃႈ ဢၼ်တူဝ်ႈတၼ်းၸႅင်ႈၼႄဝႃႈ ပဵၼ်ၶိူဝ်းလွတ်ႈလႅဝ်း ဢၼ်ဢမ်ႇၸႂ်ႈၶီႈၶႃႈတႂ်ႈမိုဝ်းၽႂ်။ ပဵၼ်ဝၼ်းဢၼ်တႅပ်းတတ်း သုၼ်ႇတၢင်းၽွၼ်းပၢင်ႈ လွင်ႈလီလွင်ႈၸႃႉ တႃႇပိုၼ်းတႆးမႃးဝၼ်းၼိူင်ႈ။ ပဵၼ်ဝၼ်းဢၼ်ဢမ်ႇလီလူင်လီလိုမ်းပႅတ်ႈ၊ ပဵၼ်ဝၼ်းထုၵ်ႇလီဢဝ်ယိုင်ႈယႂ်ႇတႃႇထၢတ်ႈၸႂ် ၸိူဝ်ႉၶိူဝ်းယူႇတႃႇသေႇၼၼ်ႉဝၼ်းၼိူင်ႈ။ ပဵၼ်ဝၼ်းၵၵူၼ်းမိူင်းတႆး ၶိူဝ်းၵူၼ်းၸိူဝ်ႉၸၢတ်ႈၸိုင်ႈတႆးတင်းလၢႆ ၵူႊလၢႆလၢႆၶိူဝ်း လႆႈၸႂ်ၽွမ်ႉႁူမ်ႈၵၼ် ပဵၼ်ၼမ်ႉၼိူင်ႈၸႂ်လဵဝ်မႃးၼၼ်ႉဝၼ်းၼိူင်ႈ။ ပဵၼ်ဝၼ်း်ၸဝ်ႈၶႆႈၾႃႉၸိုင်ႈတႆးတင်းလၢႆ ႁူမ်ႈပႃးၵူၼ်းမိူင်းပတ်းပိုၼ်ႉတင်းသဵင်ႈ မေႃၽွမ်ႉႁူမ်ႈလႆႈၸႂ်ၵၼ် တႃႇၵေႃႇတင်ႈပဵၼ်လုမ်းလူင်တႅၼ်းၽွင်းမိူင်းတႆးလႄႈလိူၵ်ႈဢဝ်လႆႈၸုမ်းပွင်ၵၢၼ်တၢင်တူဝ်မိူင်းတႆး (လူင်ပွင်ႊၸိုင်ႈတႆးတူဝ်ႈတၼ်း)ဝႆႉထႃႈၼၼ်ႉၵေႃႈၸႂ်ႈ။ ပဵၼ်ဝၼ်းဢၼ်မၵ်းမၼ်ႈလႆႈလွင်ႈၽွမ်ႉႁူမ်ႈ တႃႇၵေႃႇတင်ႈမုၵ်ႉၸုမ်းၽွမ်ႉႁူမ်ႈ ၶိူဝ်းတႄးႁူတ်ႈသၼ်လွႆၼၼ်ႉၵေႃႈၸႂ်ႈ။ ပဵၼ်ဝၼ်းတမ်းမၼ်ႈလႆႈၸႂ်ၽွမ်ႉႁူမ်ႈ တႃႇၸင်ႈၸႂ်ဢဝ်လွတ်ႈလႅဝ်းသဝ်းၶေႃႈ ပုၼ်ႈၸိူဝ်ႉၸၢတ်ႈၵေႃႈၸႂ်ႈယဝ်ႉ။";
        input += "ဝၼ်းၶိူဝ်းတႆး ဢမ်ႇၼၼ် ဝၼ်းမိူင်းတႆး ဢမ်ႇၼၼ် ဝၼ်းၸိူဝ်ႉၸၢတ်ႈၸိုင်ႈတႆး ၼႆႉ တီႈတေႉမၼ်း ပဵၼ်ဝၼ်းမိူဝ်ႈတွင်းမၢႆလွင်ႈဝၼ်းထီႈၸဵတ်း၊ လိူၼ်ထူၼ်ႈသွင်(ၾႅပ်ႇပႂႃႇရီႇ) ပီႊ 1947 ၼီႈ တီႈဝဵင်းပၢင်လူင် ၸိုင်ႈတႆးပွတ်းၸၢၼ်း၊ ဢၼ်ၽူႈတၢင်တူဝ်ၸုမ်းတႆး၊ ၶၢင်၊ ၶျၢင်း ၸိူဝ်းပဵၼ်ၸၢဝ်းၶိူဝ်း တႄးႁူတ်ႈသၼ်လွႆၶဝ် လႆႈလူင်းလၢႆးမိုဝ်းၽွမ်ႉၸႂ်ၵၼ် တႃႇႁူမ်ႈႁွမ်းဢၼ်လွတ်ႈလႅဝ်းသဝ်းၶေႃႈတီႈၶုၼ်ဢိင်းၵလဵတ်ႈၶဝ် ၼၼ်ႉယဝ်ႉ";
        input += "ဝီႇၶီႇၽီးတီးယႃး ၼႆႉ ပဵၼ်ပပ်ႉသႅၼ်သမ်ႇ ဢၼ်ၵူၼ်းတင်းၼမ် ႁူမ်ႈၵၼ် တႅမ်ႈထတ်း ၼၼ်ႉယဝ်ႉ။ ၸႂ်ႉတိုဝ်းဝႆႉ ဝႅပ်ႇယၢင်ႇ ဝႅပ်ႉသၢႆႉ ဢၼ်ႁွင်ႉဝႃႈ ဝီႇၶီႇ ၼၼ်ႉသေ သၢင်ႈႁႂ်ႈ တႃႇၵူၼ်းတင်းၼမ် ႁူမ်ႈၵၼ် တႅမ်ႈထတ်းလႆႈၼၼ်ႉ။ ၵူၼ်းတင်းၼမ် ဢွၼ်ၵၼ် တႅမ်ႈထတ်းမူၼ်ႉမႄးသေ ႁဵတ်းႁႂ်ႈ ဝီႇၶီႇၽီးတီးယႃး တိူဝ်းလီသေဢွၼ် တွၼ်းလိူဝ်သေၵဝ်ႇယူႇယဝ်ႉ။ တီႈ ဝီႇၶီႇၽီးတီးယႃးတႆးၼႆႉ တေလႆႈၸႂ်ႉတိုဝ်း ၾွၼ်ႉၸိူဝ်းဢၼ် သၢင်ႈၸွမ်း လၵ်းၸဵင်ယူႇၼီႇၶူတ်ႉ 5.2 သေ တႅမ်ႈလႆႈ ထတ်းလႆႈယူႇဢေႃႈ။";
        input += "ဝီႇၶီႇၽီးတီးယႃးၼႆႉ ၸႂ်ႉၾွၼ်ႉယူႇၼီႇၶူတ်ႉဢၼ်လႂ်သေဢမ်ႇဝႃႈ ၸၢင်ႈတႅမ်ႈၸၢင်ႈလူလႆႈယူႇ။\n" +
                "ၸိူဝ်းတွၼ်ႈတႃႇ ၽူႈပိၼ်ႇၽႃႇသႃႇတႆးၶဝ်ၼၼ်ႉ လိူၵ်ႈ \"Translation\" တီႈ \"လွင်ႈၶဝ်ႈႁူမ်ႈ\" ဢၼ်မီးတီႈၸဵင်ႇၼိူဝ် ၽၢႆႇၶႂႃ ၼၼ်ႉသေ ဢဝ်တင်းၸွႆႈထႅမ် Translation Tool သေၵေႃႈ ပိၼ်ႇၽႃႇသႃႇလႆႈယူႇၶႃႈ။\n" +
                "ၵပ်းၵၢႆႇလူၺ်ႈ လၢႆးလေႃးတူဝ်လိၵ်ႈဝေႃးႁၢၼ် တူဝ်လိၵ်ႈတႆး သေ ၸၢင်ႈၵႂႃႇတူၺ်းလႆႈတီႈဝေႃးႁၢၼ်တႆး ၼႆႉလႆႈယူႇ။\n" +
                "တွၼ်ႈတႃတူၺ်း ပိူင်ယၢင်ႇလႄႈ တွၼ်ႈတႃႇ ပွင်ၸႂ်လႆႈငၢႆႈငၢႆႈၼၼ်ႉ လူတူၺ်း ႁူဝ်ႁႅၵ်ႈ ဢွၼ်တၢင်းလႄႈ။\n" +
                "ဝီႇၶီႇၽီးတီးယႃးတႆးၼႆႉ မီး ပဝ်ႉမၢႆႁႃႈယိူင်ႈ ယဝ်ႉ။\n" +
                "ပေႃးမီးလွင်ႈလူဝ်ႇထၢမ် ထၢမ်တီႈ ၼႃႈလိၵ်ႈၼႆႉလႄႈ။\n" +
                "ပေႃးလူဝ်ႇတၢင်းၸွႆႈထႅမ်ၼႆႉ ၵႂႃႇတီႈ ၼႃႈလိၵ်ႈဢၼ်ၼႆႉလႄႈ။\n" +
                "ပေႃးလူဝ်ႇမႄးထတ်း၊ လူဝ်ႇႁုပ်ႈပွတ်း ၼႆၸိုင် တူၺ်းတီႈ ႁူဝ်ႁုပ်လွင်ႈမႄးထတ်းလႄႈ။\n" +
                "ပေႃးၶႂ်ႈၸၢမ်းတူၺ်းၼႆႉ ၸႂ်ႉ ၼႃႈလိၵ်ႈဢၼ်ၼႆႉ သေ ၸၢင်ႈႁဵတ်းတူၺ်း လွင်ႈၸၢမ်းမႄးထတ်းၼႃႈလိၵ်ႈ လႆႈယူႇ။\n" +
                "ပေႃးၶႂ်ႈလဵပ်ႈႁဵၼ်း လွင်ႈမႄးထတ်း ၵႂၢင်ႈၵႂၢင်ႈၶႂၢင်ၶႂၢင်ၼႆၸိုင် လူတူၺ်း ၼႃႈလိၵ်ႈၼႆႉလႄႈ။\n" +
                "ပေႃးၶႂ်ႈပၼ်တၢင်ႇႁၼ်ထိုင်တၢင်ႇၸိူဝ်း၊ တွၼ်ႈတႃႇ လွင်ႈဢုပ်ႇဢူဝ်းၼႆ ၶဝ်ႈဢုပ်ႇဢူဝ်းလႆႈတီႈ လၢၼ်ႉၼမ်ႉၼဵင်ႈ ဝီႇၶီႇၽီးတီးယႃးတႆး (ဢမ်ႇၼၼ်) ၾဵတ်ႉပုၵ်ႉၶ် ဝီႇၶီႇတႆးလႆႈယူႇၶႃႈ။";
        input += "ၵျူဝ်ႇၵမ်ႇၽႃႇ Earth (မၢႆ: \uD83D\uDF28) ၼႆႉ ပဵၼ်ၵျူဝ်ႇ ဢၼ်ၵူၼ်းလႄႈသတ်း ယူႇသဝ်း ပဵၼ်ဢွင်ႈတီႈ တူၼ်ႈမႆႉမၢၵ်ႈမွၵ်ႇၶဝ် ဢွၵ်ႇႁုၼ်ႈမုၼ်းလႆႈၼၼ်ႉယဝ်ႉ။ ပေႃးလုၵ်ႈတီႈ လႅတ်ႇ ဢၢၼ်ႇမႃးၸိုင် ၶဝ်ႈပဵၼ် ၵျူဝ်ႇမၢႆသၢမ် လုၵ်ႈၼိုင်ႈ။ ၵမ်ႇၽႃႇ (လုမ်ႈၾႃႉ)ၼႆႉ မီးဝႆႉၵျူဝ်ႇၵႅမ်လုၵ်ႈၼိုင်ႈ ဢၼ်ပဵၼ် လိူၼ်ၼၼ်ႉယဝ်ႉ။ ၵမ်ႇၽႃႇၼႆႉ လႆႈဢဝ်ၶၢဝ်းယၢမ်း 365.2564 ဝၼ်းသေ ပၼ်ႇႁွပ်ႈလႅတ်ႇ ၼိုင်ႈႁွပ်ႈလႄႈ ႁွင်ႉဝႃႈ ၼိုင်ႈပီယဝ်ႉ။ ပေႃးဢဝ် လွင်ႈမၵ်းမၢႆဝၼ်း ရေႇတီႇယူဝ်ႇမႅတ်ႉထရိတ်ႉဝႃႈၸိုင် ၵမ်ႇၽႃႇၼႆႉ ဢႃႇယုမၼ်း မီးမႃး ပီပွင်း 4.54 ၿီႇလီႇယၢမ်ႇပီယဝ်ႉ ၼႆယူႇ။\n" +
                "\n" +
                "လႅတ်ႇၼႆႉ ပိူင်းပၼ်သၢႆလႅင်း လႄႈ ပၼ်ပၼ် ထၢတ်ႈဢုၼ်ႇ တမ်ႈတီႈ ၵမ်ႇၽႃႇယဝ်ႉ။ လုၵ်ႈၵမ်ႇၽႃႇၼႆႉ ထၢတ်ႈၼမ်ႉ ၶဝ်ႈပႃးဝႆႉ 71% သေ ၼင်လိၼ် ၶဝ်ႈပႃးဝႆႉ 29% မွၵ်ႈၶၼၢၼ်ႉယူႇ။ ၼႂ်းၸုမ်းတူင်ႇဝူင်းလႅတ်ႇၼၼ်ႉ ၵမ်ႇၽႃႇၼႆႉဢၼ်လဵဝ်ၵူၺ်း ပဵၼ်တီႈယူႇ ဢၼ်တူဝ်သတ်းယူႇသဝ်းလႆႈ။ ၸိူဝ်ႉၽၼ်းတူဝ်ၸႂ် ဢၼ်ယူႇသဝ်း ၼိူဝ်ၵမ်ႇၽႃႇ မီးယူႇမွၵ်ႈ 10 – 14 မီႇလီႇယၢမ်ႇ။ ၸိူဝ်ႉၽၼ်းၵူၼ်းတႄႉ မီးယူႇ 7.6 ၿီႇလီႇယၢမ်ႇယဝ်ႉ။ ဢၼ်မီးႁိမ်းၸမ် ၵမ်ႇၽႃႇႁဝ်းၼၼ်ႉ ယွၼ်ႉပိူဝ်ႈ ၵျူဝ်ႇၽတ်း (ၵျူဝ်ႇၵျႃႇသပတေး) ၼႆႉ ႁႅင်းၸၼ်မၼ်း ႁႅင်းယႂ်ႇၼႃႇလႄႈ တေလႆႈဝႃႈ လွင်ႈမၢၵ်ႇႁိၼ်မိၼ် တေမႃးတူၵ်းသႂ်ႇ ၼိူဝ်ၵမ်ႇၽႃႇႁဝ်းၼၼ်ႉ မၼ်းႁႄႉၵင်ႈပၼ်ဝႆႉယူႇ ၼႆယဝ်ႉ။ ဝၢႆးသေ လူၵ်ႈၵမ်ႇၽႃႇ တႄႇတင်ႈပဵၼ်မႃးယဝ်ႉ မိူဝ်ႈပီၿီႇလီႇယၢမ်ႇ မိူဝ်ႈၸဝ်ႉၼၼ်ႉ တူဝ်မီးၸႂ်ၶဝ် တေလႅပ်ႈတႄႇမီးမႃး ၼႂ်းၼမ်ႉပၢင်ႇလၢႆႇ ၼမ်ႉသမုတ်ႉတရႃႇယဝ်ႉ။ ယွၼ်ႉပိူဝ်ႈ လူမ်းၵမ်ႇၽႃႇလႄႈ ၼင်လိၼ်မႃးၵုမ်ႉၸွႆႈၵၼ်သေ မိူဝ်ႈပူၼ်ႉမႃး ပီပွင်း 4.1 ၿီႇလီႇယၢမ်ႇၼၼ်ႉ သတ်းတူဝ်မီးၸႂ် လႅပ်ႈတေ ပဵၼ်မႃး မီးမႃးယူႇယဝ်ႉ။ ပေႃးဢဝ် ပိုၼ်းၵမ်ႇၽႃႇဝႃႈၸိုင် ယွၼ်ႉပိူဝ်ႈ လႆႈထူပ်းမႃး လွင်ႈမူၺ်ႉၸိူဝ်ႉၶိူဝ်း ၸိူဝ်ႉၽၼ်းတူဝ်ၸႂ်လႄႈ ၸၢဝ်းတူဝ်မီးၸႂ် 99% ၼၼ်ႉ ယၢမ်ႈလႆႈ လူႉႁၢႆမႃးယဝ်ႉ။ ၸိူဝ်ႉၽၼ်း ဢၼ်တိုၵ်ႉၵိုတ်းဝႆႉ ယူႇ တေႃႇထိုင် ယၢမ်းမိူဝ်ႈလဵဝ်ၼႆႉ ႁႅင်ႉၵႂၢင်ႈၶႂၢင်ၼႃႇလႄႈ ယင်းပႆႇၸၢင်ႈ လၢတ်ႈၼႄၵၼ်လႆႈ ၸေးၸွတ်ႇၵွၼ်ႇ။\n" +
                "\n" +
                "လွင်ႈၽွတ်ႈပဵၼ်\n" +
                "လွင်ႈၽွတ်ႈပဵၼ် လႅတ်ႇၼႆႉ ဢႃႇယုဢၼ်ၵႄႇသေပိူၼ်ႈၼၼ်ႉ မီးမႃး ပီပွင်း 4.5672 ± 0.0006 ၿီႇလီႇယၢၼ်ႇပီယဝ်ႉ။ ပေႃးဢဝ်ၸွမ်း ႀီႇဢူဝ်ႇရီႇဝႃႈၸိုင် ၵမ်ႇၽႃႇၼႆႉ ပဵၼ်ၸၢၵ်ႈလႅတ်ႇ တႅၵ်ႇဢွၵ်ႇသေ ပဵၼ်မႃးၼႆယဝ်ႉ။\n" +
                "\n" +
                "ဢၼႃႇၵၢတ်ႈ မိူဝ်းၼႃႈ\n" +
                "ပုၼ်ႈတႃႇ ဢၼႃႇၵၢတ်ႈ ၵမ်ႇၽႃႇမိူဝ်းၼႃႈၼၼ်ႉ မၼ်းၵပ်းၵၢႆႇၵၼ် တင်းလႅတ်ႇဝႆႉယူႇ။ ပေႃးထႅင်ႈ ပီပွင်း 1.1 ၿီႇလီႇယၢၼ်ႇၸိုင် လွင်ႈႁိူဝ်ႈလႅင်း လႅတ်ႇၼႆႉ တေႁႅင်းလိူဝ်သေၼႆႉ 10%၊ ပေႃးထႅင်ႈ ပီပွင်း 3.5 ၿီႇလီႇယၢၼ်ႇၸိုင် တေလိူတ်ႇႁိူဝ်ႈလႅင်းလိူဝ်ၼႆႉ 40% ၼႆယဝ်ႉ။ ၵမ်ႇၽႃႇ မိူင်းၵူၼ်းၵေႃႈ တေမႆႈလိူဝ်မႃး ႁႅင်းၶွၼ်ႈ ထၢတ်ႈၶႃႇပုၼ်ႇတၢႆႇဢွၵ်ႉသၢႆႉ တေယွမ်းမႃးယူႇ။ ပေႃးပဵၼ်ၼၼ်မႃးၸိုင် ၼႂ်းပီပွင်း 500 တေႃ 900 မီႇလီႇယၢၼ်ႇၼၼ်ႉ တူၼ်ႈမႆႉ တူၼ်ႈမွၵ်ႇၸိူဝ်းၼႆႉ ဢဝ်လၢႆးၾူဝ်ႇတူဝ်ႇသိၼ်ႇတိတ်ႉသိတ်ႉသေ တေဢမ်ႇၸၢင်ႈ ႁဵတ်းၵၢၼ် တႃႇမုၼ်းယႂ်ႇမႂ်ႇၵီႈမႃးလႄႈ တူၼ်ႈမႆႉ တေလဵၵ်ႉၵေႇဢေႇမၢင်ၵႂႃႇ။ ယွၼ်ႉၼၼ် လူမ်းဢွၵ်ႉသီႇၵျိၼ်ႇၵေႃႈ တေဢေႇၵႂႃႇ။ ပေႃးႁိုင်မႃးထႅင်ႈ ပီပွင်း 1 ၿီႇလီႇယၢၼ်ႇၸိုင် ၼမ်ႉဢၼ်မီးၼိူဝ်လိၼ်တင်းသဵင်ႈ တေႁႅင်ႈႁႅတ်းၵႂႃႇ၊ ႁႅင်းမႆႈ ၵမ်ႇၽႃႇၵေႃႈ တေထိုင်ၵႂႃႇ 70°C (158°F) ယူႇ၊ တႄႇဢဝ် ၶၢဝ်းယၢမ်းၼၼ်ႉၵႂႃႇ ထႅင်ႈပီပွင်းမွၵ်ႈ 500 မီႇလီႇယၢၼ်ႇၼၼ်ႉ တူဝ်မီးၸႂ် လႅပ်ႈတေသိုပ်ႇယူႇသဝ်းၵႂႃႇလႆႈယူႇ။ သင်ဝႃႈ ပၢၵ်ႈပႅတ်ႈလူမ်း ၼၢႆႇထရူဝ်ႇၵျိၼ်ႇၸိုင် ထႅင်ႈပီပွင်း 2.3 ၿီႇလီႇယၢၼ်ႇၼၼ်ႉ တူဝ်မီးၸႂ် တေလႅပ်ႈယူႇလႆႈယူႇ။ သင်ယုမ်ႇယမ်ဝႃႈ လႅတ်ႈၼႆႉ တေသိုပ်ႇ ၼိမ်မၼ်ႈယူႇၸိုင် ၼႂ်းပီပွင်း 1 ၿီႇလီႇယၢၼ်ႇၼၼ်ႉ ၼမ်ႉသမုတ်ႇတရႃႇ မွၵ်ႈ 27% ၼၼ်ႉ တေႁွတ်ႈထိုင်ၵႂႃႇ တီႈၼႂ်းပိုၼ်ႉလိၼ်ၵမ်ႇၽႃႇယူႇ ၼႆယဝ်ႉ။\n" +
                "\n" +
                "ပေႃးထႅင်ႈပီပွင်း 5 ၿီႇလီႇယၢၼ်ႇၸိုင် လႅတ်ႇၼႆႉ တေယဵၼ်းပဵၼ်ၵႂႃႇ လၢဝ်လႅင်လူင်သေ တေယႂ်ႇလိူဝ်သေၼႆႉ 250 ပုၼ်ႈယဝ်ႉ။ တၢင်းယႂ်ႇမၼ်း တေမီး 1 AU (လၵ်းပွင်း 93 မီႇလီႇယၢၼ်ႇ)ယဝ်ႉ။ ၵမ်ႇၵျမ်ႇမႃႇ ၵမ်ႇၽႃႇလူင်ႁဝ်းၼႆႉၵေႃႈ တေႃႈဢမ်ႇတႅတ်ႈၼႅတ်ႈ။ ယွၼ်ႉပိူဝ်ႈ ဢမ်ႇမီး ႁႅင်း Tidal effect ယဝ်ႉလႄႈ လႅတ်ႇၼႆႉ တေသုတ်ႉၶၢႆႉ ယၢၼ်ၵႆ သၢႆတၢင်းပၼ်ႇၵမ်ႇၽႃႇၵႂႃႇ မွၵ်ႈ 1.7 AU ယဝ်ႉ။ လွင်ႈႁိူဝ်ႈလႅင်းလႅတ်ႇၼၼ်ႉၵေႃႈ တေႁိူဝ်ႈႁႅင်းလိူဝ်မႃး 500 ပုၼ်ႈလႄႈ တူဝ်မီးၸႂ် ၼိူဝ်ၵမ်ႇၽႃႇတင်းသဵင်ႈ ဢမ်ႇၼၼ် တင်းၼမ် တေလူႉလႅဝ်ယူႇ။ ယွၼ်ႉ ဢမ်ႇမီး Tidal effect လႄႈ ၵမ်ႇၽႃႇၼႆႉ တေၶဝ်ႈၵႂႃႇၸူးၸမ် လႅတ်ႇသေ တေမႆႈလႅဝ်ၵႂႃႇၼႆယဝ်ႉ။\n" +
                "\n" +
                "ၼႂ်းၵႃႊ လူၵ်ႈလူင်ၵဝ်ႈဢၼ် ဢၼ်မီးတီႈၼႂ်းပၵ်းပိူင်လႅင်ႊဝၼ်းၼႆႉ လုမ်ႈၾႃႉၼႆႉ ပဵၼ်လူၵ်ႈဢၼ်ယႂ်ႇသေပိူၼ်ႈ တီႈသုတ်းထူၼ်ႈထီႈႁႃႈယဝ်ႉ။ ယဝ်ႉသမ်ႉ ပဵၼ်လူၵ်ႈ ဢၼ်တီႈၵူၼ်းၶူင်းၵၢင်ႁဝ်း ယူႇသဝ်းၼၼ်ႉယဝ်ႉ။ လုမ်ႈၾႃႉၼႆႉ\n" +
                "\n" +
                "ႁၢင်ႈလုၵ်ႈလုမ်ႈၾႃႉမိူဝ်ႈတူၺ်းယူႈတၢင်းၼွၵ်။\n" +
                "လႆႈဝႃႈႁမ်ႉၶႂ်ႈပဵၼ်ၼင်ႇ ပိူင်ၾၢင်ႁၢင်ႊမၢၵ်ႇၼင်ၼၼ်ႉယဝ်ႉ။ မီးတၢင်းၵႂၢင်ႈမွၵ်ႈ 7,920 လၵ်း(12,743 ၵီႇလူဝ်ႇမီႇထိူဝ်ႇ)ယဝ်ႉ။ တႃႇမွၵ်ႈ 29 ဝၢၵ်ႈလႅၼ်ႊၵႂၢင်ႈလုမ်ႈၾႃႉပတ်းပိုၼ်ႉ ဢၼ်ပဵၼ်တႃႇ 197 လၢၼ်ႉလွၵ်းလၵ်း(510 လၢၼ်ႉလွၵ်းၵီးလူဝ်းမီးတႂ်း)ၼႆႉ ပဵၼ်လိၼ်ယဝ်ႉ။ ဢၼ်ၵိုတ်းထႅင်ႈလႅၼ်ႊၵႂၢင်ႈလုမ်ႈၾႃႉ ၸိူဝ်းၼၼ်ႉတႄႉ ပဵၼ်ၼမ်ႉသမုတ်ႉ တင်းပၢင်ႇလၢႆႇၶဝ်ႁူမ်ႈဝႆႉယဝ်ႉ။\n" +
                "\n" +
                "ပွတ်းတွၼ်ႊၼႂ်းၵမ်ႈၾႃႇၼႆႉ ပဵၼ်ဝႆႉၸၼ်ႉထၢပ်ႈ ပိူင်လူင်မၼ်းသၢမ်ၸၼ်ႉယဝ်ႉ။ ၸၼ်ႉထၢပ်ႈတၢင်းၼႂ်းၼႂ်းၼၼ်ႉ ပဵၼ်ၵႅၼ်ၸႂ်ႊမၼ်း။ မၼ်းမီးလတ်းၵၢင်ႊမွၵ်ႈ 43,00 လၵ်း (6,919 ၵီးလူဝ်းမီးတႂ်း)။ ယဝ်ႉၵေႃႈ လႆႈယုမ်ႇယမ်ဝႃႈ ပိူင်လူင်မၼ်းပႃးႁႄႊၼိၵ်းၵလ်ႊ တင်းလဵၵ်းၶၢင်ယဝ်ႉ။ ၶဝ်ၼႆႉမီးဝႆႉပဵၼ်ဝႆႉတၢင်ႉမႆႈသုင်ႁႅင်းၼႃႇလႄႈ ပေႃးပဵၼ်ၼမ်ႉဝႆႉၼၼ်ႉယဝ်ႉ။ ၸဝ်ႈပၢႆးသၢႆႊၶဝ်ယုမ်ႇယမ်ဝႆႉဝႃႈ ၵႅၼ်ႊၵၢင်ႊၸႂ်ႊၼႂ်းၼၼ်ႉ ပဵၼ်ဝႆႉႁူၺ်ႇမၢၵ်ႇလဵၵ်း ဢၼ်လွမ်ႊလူင်ဝႆႉၼႆလႂ်ယဝ်ႉ။ ဢၼ်ႁူမ်ႇႁေႃႇဝႆႉၸွမ်းၵႅၼ်ႊၵၢင်ႊၼႆႉ သမ်ႉပဵၼ်ၸၼ်ႉထၢပ်ႇႁိၼ်ၵႅၼ်ႇ ဢၼ်မီးတၢင်းၼႃမွၵ်ႈ 18,000လၵ်း( 2,896 ၵီးလူဝ်းမီးတႂ်း)ၼၼ်ႉယဝ်ႉ။ ၽၢႆႇၼိူဝ်ၼႆႉ ၸင်ႇပဵၼ်ၸၼ်ႉထၢပ်ႈလိၼ်မိူင်းယဝ်ႉ။ ၼႆႉၵေႃႈ ပဵၼ်ႁိၼ်ၵႅၼ်ႇၶဝ်သေပဵၼ်ဝႆႉၼင်ႇၵဝ်ႇယဝ်ႉ။ မၼ်းသမ်ႉမီးတၢင်းၼႃမွၵ်ႈ 20 လၵ်း (32 ၵီးလူဝ်းမီးတႂ်း) ၽၢႆႇတႂ်ႈလိုမ်လိၼ်သေ သမ်ႉၼႃမွၵ်ႈ သၢမ်လၵ်း(4.8 ၵီးလူဝ်းမီးတႂ်း) ၽၢႆႇတႂ်ႈၼမ်ႉသမုတ်ႉလူင်ၶဝ်ယဝ်ႉ။\n" +
                "\n" +
                "ၼႆႉၸမ်း ပေႃးလုၵ်ႉတီႈၾႃႉၵၢင်ႁၢဝ်သေတူၺ်းၼႆ လုမ်ႈၾႃႉၼႆႉ လႆႈႁၼ်မိူၼ်ဝႆႉၼင်ႇၼႆယဝ်ႉ။ ၽူႈၾၢႆႈၶူင်းၵၢင်ႁၢဝ်ၵေႃႉၼိူင်ႈဢွၵ်ႈလၢတ်ႈၼေဝႃႈ လုမ်ႈၾႃႉၼႆႉ မိူၼ် \"ႁူၺ်ႇၵႅဝ်ႈသီသွမ်ႇလူင်\" ဢၼ်ၼိူင်ႈၼႆယဝ်ႉ။";
        String output = ShanRuleBasedSyllableSegmentation.segment(input);
        System.out.println(output);
    }
}