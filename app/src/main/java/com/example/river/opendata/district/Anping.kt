package com.example.river.opendata.district

import android.graphics.PointF

class Anping {
    companion object {
        private const val gml = "120.18674217600005,22.998925462000045 120.18671164500006,22.998833833000049 120.18670545600003,22.998741235000068 120.1865857570001,22.998248587000091 120.18655014500007,22.997911965000071 120.18649319300005,22.997373623000044 120.18647787300006,22.997228807000056 120.18638576900003,22.996229658000061 120.18633025300005,22.995672533000061 120.18631313700007,22.995268500000066 120.18630817000008,22.995008219000056 120.18633566400001,22.994790463000072 120.18642292800007,22.994427747000088 120.18664230400009,22.993859913000051 120.18676220900011,22.993509475000053 120.18679602100008,22.993328061000057 120.18683685100007,22.993068014000073 120.18691658100011,22.991865785000073 120.186951669,22.991472541000064 120.18704049200005,22.990849567000055 120.18703754300009,22.990312098000061 120.18700273700006,22.989573500000063 120.18693175600004,22.989081893000048 120.18686455600005,22.988616475000072 120.18682712100008,22.988351789000035 120.18676146300004,22.987304348000066 120.18668586700005,22.986819756000045 120.186608922,22.986559096000065 120.186549356,22.986312303000091 120.18622952100009,22.986130077000041 120.18582324900001,22.985877432000052 120.18538570800001,22.985554640000089 120.18506782100008,22.98527761400004 120.18477190500005,22.984996179000063 120.18451908900011,22.984719477000056 120.18406072300002,22.98421146600009 120.18372064800008,22.983848538000075 120.18333687000006,22.983505693000041 120.18308188600008,22.983346983000047 120.18294152300007,22.983254531000057 120.18280643600008,22.983175669000047 120.18267140600005,22.983087039000054 120.18255625200004,22.982998953000049 120.18240892000006,22.982907004000083 120.18226155500008,22.982819936000055 120.18209473900004,22.982747429000085 120.182017513,22.982707948000041 120.18195954400005,22.982686483000066 120.18189426000004,22.982642731000055 120.18181751100008,22.982591294000088 120.18163166500005,22.982463318000043 120.181404025,22.982320658000049 120.1812741980001,22.982245083000066 120.18113029100005,22.982169425000052 120.18096879700011,22.982090435000089 120.18088451800008,22.982052551000038 120.18065633100002,22.981939012000055 120.18053674600003,22.981875141000046 120.18048084200007,22.981845283000041 120.180405328,22.981813946000045 120.1803315730001,22.981782629000065 120.18024962100003,22.98175342400009 120.180091737,22.981659788000059 120.18000918000007,22.981628432000036 120.17980895700009,22.981549231000088 120.179715955,22.981498270000088 120.17958771500003,22.98145200600004 120.1794631140001,22.981386226000041 120.17933324,22.98131879500005 120.17917878100002,22.981241455000088 120.17903585100009,22.981158099000083 120.178913,22.981093946000044 120.17882712200003,22.981029999000043 120.17870797,22.980936563000057 120.17855907900002,22.980812024000045 120.178404838,22.980698863000043 120.17821267600004,22.98055660700004 120.178004117,22.980400822000036 120.17789359100004,22.980336741000087 120.17772355600005,22.980215352000073 120.17754646800006,22.980095561000041 120.17742901300005,22.98001352600005 120.17732972600004,22.979941628000063 120.17715795100003,22.979816987000049 120.17705455800001,22.979738276000091 120.1768458040001,22.97961506200005 120.17673014800005,22.97952652500004 120.1765705470001,22.979426355000044 120.17648112900008,22.979365643000051 120.17632336100007,22.979254096000091 120.17622255100002,22.979175732000044 120.17605937100007,22.979085323000049 120.1758734870001,22.97896548500006 120.17575254900009,22.97887692200004 120.17558601900009,22.978758806000087 120.17545804000008,22.97867020700005 120.17541068700007,22.978640639000048 120.17535458900011,22.978601266000055 120.17529209100007,22.978552295000043 120.1751991430001,22.978493196000045 120.17496934600001,22.978356839000071 120.17484140700003,22.978261708000048 120.17464499100004,22.978136937000045 120.17456971600007,22.978066517000059 120.17443465600002,22.977984390000074 120.17436982900006,22.977933564000068 120.17424601300002,22.977848488000063 120.1741197770001,22.977763155000048 120.17397950600002,22.977669602000049 120.1738148180001,22.977538467000045 120.1737289030001,22.977481020000084 120.17353604800007,22.977349738000044 120.17340112800002,22.977244811000048 120.17323362000002,22.977136722000068 120.17311607900001,22.977069348000043 120.17293889000007,22.976967459000036 120.1728441140001,22.97691973700006 120.17267403700009,22.97680648700009 120.17259513600004,22.976753962000089 120.17246886100008,22.976675148000083 120.17230929800007,22.976570081000091 120.17215747900002,22.976487755000051 120.17196368300006,22.976340662000041 120.17168580600003,22.976147122000043 120.171382032,22.975943433000054 120.171313682,22.97590815500007 120.17121456700011,22.975843614000041 120.17105719400001,22.975754748000043 120.17099039300001,22.975712371000043 120.17089341500002,22.975651842000048 120.17074901000001,22.975565030000041 120.17066700600003,22.97553259700004 120.17055070800006,22.975447937000069 120.17042363300004,22.975357233000068 120.17026560500005,22.975234644000068 120.17012128400006,22.975133843000037 120.17002216800006,22.975069283000039 120.16997038600005,22.975047008000047 120.16987545100005,22.975006489000066 120.169806462,22.974968109000088 120.1696599390001,22.974873295000066 120.16957583500005,22.974830835000091 120.16948518900006,22.974796345000073 120.16931685400004,22.974731431000066 120.16912055800003,22.974640362000059 120.16874587200005,22.97445274800009 120.16860564500007,22.974389976000055 120.16839196000001,22.97431281300004 120.16824523300011,22.974252020000051 120.168003634,22.974140703000046 120.16785693200006,22.974075900000059 120.167803123,22.974031596000088 120.16771269900005,22.973961084000052 120.1676190500001,22.973856563000083 120.1674800290001,22.973688914000036 120.16735435200008,22.973541271000045 120.16728094000007,22.973458108000045 120.16725271500002,22.973426136000057 120.16720198900009,22.973353620000069 120.16710571100009,22.973251046000087 120.16703719200007,22.973175421000064 120.16698379500008,22.973134018000053 120.166869249,22.973065354000084 120.1667126320001,22.972961381000061 120.16648517700003,22.972807044000035 120.16625310800009,22.972655518000067 120.16608365800005,22.972541191000062 120.16595481400009,22.972454267000046 120.16576400200006,22.972324222000054 120.16552129800004,22.972157043000038 120.16536406100011,22.972051286000067 120.16534251000007,22.972037391000072 120.1651090790001,22.971886877000088 120.16506223200008,22.971854260000043 120.164813374,22.971691299000042 120.16454619300009,22.971516903000065 120.16432790300007,22.971368282000071 120.16418337500011,22.971272875000068 120.16405058600003,22.971179996000046 120.1637589930001,22.970987037000043 120.16360329000008,22.970881288000044 120.16334612000003,22.970705621000036 120.16321790500001,22.970617019000088 120.16298588400002,22.970458409000059 120.16273245800005,22.970291171000042 120.16251259900002,22.970149627000069 120.16238172300007,22.970061164000072 120.162216844,22.969952526000043 120.16207945000008,22.969861048000041 120.16186725400007,22.969719544000043 120.16163826900004,22.969566619000091 120.16139142000009,22.969401031000075 120.16116852200003,22.969255214000043 120.16094562500007,22.969109410000044 120.160728844,22.968966471000044 120.16048371000011,22.96880939600004 120.160259343,22.968653648000043 120.160018186,22.968486461000055 120.15982736400008,22.968359255000053 120.15956557200002,22.968185131000041 120.15936406700007,22.968050770000048 120.15917017600009,22.967924963000087 120.15897936700003,22.967796329000066 120.15881724000008,22.967693790000055 120.1586727450001,22.967606525000065 120.15843329000006,22.967444599000089 120.15833626100005,22.967396416000042 120.15817608700002,22.967299257000036 120.158081885,22.967230354000037 120.15779522700007,22.967043011000044 120.15765189900003,22.966949410000041 120.15750856900002,22.966855849000069 120.15736524100009,22.966762320000043 120.15722191000009,22.966668847000051 120.15707858100006,22.966575418000048 120.15693525200004,22.966482026000051 120.156791924,22.966388678000044 120.156648593,22.966295373000037 120.1565052630001,22.966202108000061 120.15636193300009,22.966108895000048 120.15621860200008,22.966015728000059 120.15607527200007,22.965922589000058 120.15593194100006,22.965829501000087 120.15578861100005,22.965736461000063 120.15564528000004,22.965643463000049 120.15550194900004,22.965550502000042 120.15540821000002,22.965489733000084 120.15539279400002,22.965479740000092 120.15542257300001,22.966152326000042 120.15544016300009,22.966549643000064 120.15540235900005,22.967393944000037 120.15540939000005,22.967466114000047 120.15543516300011,22.96750297300008 120.1554396890001,22.967509447000054 120.15793614900008,22.969642539000063 120.15795960000003,22.96966109400006 120.15806665900004,22.969752505000088 120.15821925900002,22.969870234000041 120.15848966700003,22.97007885000005 120.15846872400005,22.970135638000045 120.158823815,22.970427939000047 120.15922068900011,22.970753871000056 120.1597820400001,22.971225636000042 120.15980151800011,22.971314867000046 120.15979476000007,22.97139313200006 120.15979827000001,22.971489509000037 120.15989025900001,22.971638361000089 120.1594962370001,22.973144991000083 120.15887772300005,22.973970953000048 120.15867266700002,22.974886320000053 120.15793327600011,22.97569917900006 120.15677644000004,22.976970961000063 120.15559996500008,22.978390881000053 120.15323586600005,22.981369658000062 120.15185642400002,22.982432491000054 120.1500208330001,22.984191739000039 120.15000757000007,22.98420445000005 120.149907407,22.984444140000051 120.149590579,22.985202301000072 120.14883199300004,22.985728365000057 120.1480781360001,22.986821231000079 120.14748579900004,22.987785642000063 120.1468194470001,22.98816077500004 120.14657472800002,22.988298542000052 120.14634055500005,22.988430372000039 120.14572204900003,22.989256195000053 120.14436747900004,22.990307161000089 120.14356177400009,22.991180644000053 120.142455724,22.992033174000085 120.14169698500007,22.992536094000059 120.14065619600001,22.993156136000039 120.14050077500008,22.993248727000037 120.14034052,22.993344197000056 120.14095697100004,22.99450408000007 120.140927078,22.994600206000086 120.14091565800004,22.994663444000082 120.14091668500009,22.99473000100005 120.140922617,22.99479649400007 120.14090964600007,22.994837972000084 120.14088178000009,22.994880712000054 120.14083168600007,22.994927316000087 120.14079404300003,22.994977138000081 120.14080219300001,22.99502405800007 120.14082793400007,22.995088039000052 120.14086002500005,22.995165609000082 120.1409049240001,22.995265995000068 120.14099783500001,22.995432319000088 120.14106680600003,22.995567962000052 120.141091652,22.995735180000054 120.14109150900003,22.995808565000061 120.14109269700009,22.995887785000036 120.14108767700009,22.995969307000053 120.141082514,22.99598381800007 120.13943622600004,22.997414991000085 120.13956838200011,22.997546791000048 120.13966677400003,22.997644919000038 120.13997221700004,22.997932452000043 120.14011157900006,22.998069485000087 120.14029847000006,22.99825325200004 120.14043818000005,22.998473396000065 120.14049255500004,22.998550734000048 120.14066012,22.998722672000042 120.14075557700005,22.998837637000065 120.14082419900001,22.998911296000074 120.14095161400007,22.99900595400004 120.14108505500008,22.999111933000052 120.14122663500007,22.99921604900004 120.141352138,22.999291912000047 120.14142510900001,22.999320491000049 120.14172076,22.99948183500004 120.14182002700011,22.99952935500005 120.1420287090001,22.999626332000048 120.14225544500005,22.999715693000041 120.14261819900003,22.99986986600004 120.14298714400002,23.000009047000049 120.14323430400009,23.000126907000038 120.14341268500004,23.000195517000066 120.14370655700009,23.000317377000044 120.14381597300007,23.000366832000054 120.14399008600003,23.000447959000041 120.14417864100005,23.000514752000072 120.14442585200004,23.000625079000088 120.144693405,23.000731761000054 120.144997364,23.000864952000086 120.14522848400009,23.00094888700005 120.14549398300005,23.001059313000042 120.14558521900005,23.001091754000072 120.14575520700009,23.001167529000043 120.14596598500009,23.001255099000048 120.14631860900011,23.001405465000062 120.14648480300002,23.001474014000053 120.1468374640001,23.001618733000043 120.14713538000001,23.001744365000036 120.14730120600007,23.001816206000058 120.14750800400009,23.001890617000072 120.14782615800004,23.002029515000061 120.14815653000005,23.002164710000045 120.14824370200006,23.002197127000045 120.14852739700007,23.002322688000049 120.14880504300004,23.002440687000046 120.1489688910001,23.00250675500007 120.14917762700009,23.002596201000074 120.14955865700006,23.00275423100004 120.14956905700001,23.002758399000072 120.14984850600001,23.002870416000064 120.15005327400002,23.002944802000059 120.150259989,23.003032356000062 120.15044849100002,23.003108533000045 120.15072788300006,23.003225815000064 120.15085352400001,23.00328098500006 120.151078482,23.003376157000048 120.151425087,23.003515189000041 120.15168044300003,23.00362367300005 120.15193580100004,23.00373215400009 120.15211619800004,23.003804531000071 120.152342987,23.003904848000047 120.15251124100007,23.003969637000068 120.15279097000007,23.004080125000087 120.15294492800001,23.004156125000065 120.15329158400004,23.004287632000057 120.15347396800007,23.004367539000043 120.15373747800004,23.004472304000046 120.15384260200005,23.004528618000052 120.15403513500007,23.004610448000051 120.15415471600011,23.004659957000058 120.154416148,23.004772225000067 120.15456615000005,23.00483127800004 120.1548114200001,23.004928422000091 120.15496744900008,23.004998786000044 120.15512956000009,23.005071060000091 120.155413382,23.005177813000046 120.15569047200006,23.005301050000071 120.15586283700009,23.005358352000087 120.15616896400002,23.00547273300009 120.15628651500003,23.005522212000074 120.15665779400001,23.00561626800004 120.15688904300009,23.005681397000046 120.1570351360001,23.005715992000091 120.15716673700001,23.00575120600007 120.15724788700004,23.005772300000046 120.15733717800003,23.005791575000046 120.15745497600005,23.00580158300005 120.15761539700009,23.005819349000035 120.15784300600001,23.005816785000036 120.1579467680001,23.005796659000055 120.15808386400011,23.005767587000037 120.1581677800001,23.005747420000091 120.15825229900008,23.005731499000035 120.15827422400002,23.005727370000045 120.158440713,23.00570287000005 120.15857456200001,23.00568770700005 120.15875299600009,23.005672790000062 120.15891257600003,23.005656183000042 120.1591338400001,23.00564783100009 120.15931214400007,23.00565352700005 120.1594529890001,23.005655070000046 120.159578839,23.005552904000069 120.15979325500007,23.005382442000041 120.16010070800007,23.005167434000043 120.16031260300008,23.005029124000089 120.16047791800008,23.004922741000087 120.16086366100001,23.004695217000062 120.16095908600005,23.00463994200004 120.16122679400007,23.004476190000048 120.16131756600009,23.00442305200005 120.16139663800004,23.00438699700004 120.16163633100007,23.004253132000088 120.16168288400002,23.004225495000071 120.1617619540001,23.004189450000069 120.16199234500004,23.004059823000091 120.16207146900001,23.004015192000054 120.1621436480001,23.003968382000039 120.1623810640001,23.00382806500005 120.16246673800004,23.003792370000042 120.162517901,23.003769054000088 120.16269720700007,23.003649875000065 120.16275071500002,23.003622272000086 120.16282514800002,23.003586194000036 120.16292533000001,23.003511657000047 120.16297416000009,23.003490461000069 120.16305088500008,23.003458682000087 120.163132195,23.003435517000071 120.16329035000001,23.003361277000067 120.16346906900003,23.003336466000064 120.16364536000003,23.003328811000074 120.16378921500007,23.003316703000053 120.16386587300008,23.003295651000087 120.16403298300008,23.003272930000037 120.16416301700008,23.00324573100005 120.164244059,23.00322013400006 120.16436956300004,23.00317575400004 120.16444396600002,23.00314396400006 120.16452538200008,23.003103641000052 120.16460921100008,23.003048311000043 120.16475343700006,23.002976138000065 120.16480225500004,23.00295710000006 120.16487896600006,23.00292746100007 120.16494868000007,23.002904232000049 120.16503257500006,23.002838184000041 120.1651547030001,23.002725359000067 120.16522928100005,23.002665682000043 120.1652587320001,23.002634448000038 120.1652876390001,23.002603792000059 120.16529140500006,23.002599858000053 120.1670443050001,23.001933238000049 120.167744212,23.001828557000067 120.16881860400008,23.001423331000069 120.17263610400005,23.000088808000044 120.1748810790001,22.999314902000037 120.17534960900002,22.999285737000037 120.180125202,22.999107352000067 120.18038130900004,22.999097389000042 120.182536723,22.999140134000072 120.18474368900002,22.999151509000058 120.1860122920001,22.998981946000072 120.18674217600005,22.998925462000045"

        fun getLatLng(): MutableList<PointF> {
            var s = gml.split(" ")
            var result = mutableListOf<PointF>()
            for (i in s) {
                var list = i.split(",")
                result.add(PointF(list[1].toFloat(), list[0].toFloat()))
            }
            return result
        }
    }

}