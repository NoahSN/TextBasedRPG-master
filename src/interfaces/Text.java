/* @author Noah Koch
 *
 */
package interfaces;

public interface Text {
    String HARPY = "\n" +
            "           ,                                      ,\n" +
            "        |\\                                      /|\n" +
            "     ,   \\'._ ,                           ,  _.'/   ,\n" +
            "     |\\  {'. '-`\\,      ,-._**_.-,      ,/`-' .'}  /|\n" +
            "      \\`'-'-.  '.`\\      \\*____*/      /`.'  .-'-'`/\n" +
            "    ,'-'-._  '.  ) )     /`    `\\     ( (  .'  _.-'-',\n" +
            "    |\\'- _ '.   , /     /  /\"\"\\  \\     \\ ,  .'  _ -'/|\n" +
            "     \\'-.   .  ; (      \\_|^  ^|_/      ) ;   .  .-'/\n" +
            "      `'--, . ;  {`-.      \\__/      .-'}  ; . ,--'`\n" +
            "      '--`_. ;  { ^  \\    _|  |_    /  ^ }  ; ._`--'\n" +
            "      `,_.--  ;  { ^  `-'`      `'-`  ^ }  ;  --._,`\n" +
            "        ,_.-    ; {^    /        \\    ^} ;    -._,\n" +
            "         ,_.-`), /\\{^,/\\\\__/\\__//\\,^}/\\ ,(`-._,\n" +
            "           _.'.-` /.'   \\        /   `.\\ `-.'._\n" +
            "          `  _.' `       \\      /       ` '._   `\n" +
            "                        .-'.  .'-.\n" +
            "                      .'    `` ^  '.\n" +
            "                     /  ^ ^   ^  ^  \\\n" +
            "                     | ^    ^   ^   |\n" +
            "                    /^   ^/    \\  ^  \\\n" +
            "                    \\,_^_/    ^ \\_,^./\n" +
            "                     /=/  \\^   /  \\=\\\n" +
            "                 __ /=/_   | ^|   _\\=\\ __\n" +
            "               <(=,'=(==,) |  | (,==)=',=)>\n" +
            "                 /_/|_\\    /  \\    /_|\\_\\\n" +
            "                 `V (=|  .'    '.  |=) V`\n" +
            "                     V  / _/  \\_ \\  V\n" +
            "                       `\"` \\  / `\"`\n" +
            "                            \\(";
    String CROWN = "" +
            "                \n _\n" +
            "              _\\ /_\n" +
            "              >_X_< \n" +
            "       .---._  /_\\  _.---.\n" +
            "     /`.---._`{/ \\}`_.---.`\\\n" +
            "    | /   ___`{\\_/}`___   \\ |\n" +
            "    \\ \\.\"`*  `\"{_}\"`  *`\"./ /\n" +
            "     \\ \\  )\\  _\\ /_  /(  / /\n" +
            "      \\ *<()( >_X_< )()>* /\n" +
            "       |._)/._./_\\._.\\(_.|\n" +
            "       |() () () () () ()|\n" +
            "       <<o>><<o>><o>><<o>>\n" +
            "      `\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"`";
    String REAPER = "" +
            "                                       \n.\"\"--.._\n" +
            "                                           []      `'--.._\n" +
            "                                           ||__           `'-,\n" +
            "                                         `)||_ ```'--..       \\\n" +
            "                     _                    /|//}        ``--._  |\n" +
            "                  .'` `'.                /////}              `\\/\n" +
            "                 /  .\"\"\".\\              //{///    \n" +
            "                /  /_  _`\\\\            // `||\n" +
            "                | |(_)(_)||          _//   ||\n" +
            "                | |  /\\  )|        _///\\   ||\n" +
            "                | |L====J |       / |/ |   ||\n" +
            "               /  /'-..-' /    .'`  \\  |   ||\n" +
            "              /   |  :: | |_.-`      |  \\  ||\n" +
            "             /|   `\\-::.| |          \\   | ||\n" +
            "           /` `|   /    | |          |   / ||\n" +
            "         |`    \\   |    / /          \\  |  ||\n" +
            "        |       `\\_|    |/      ,.__. \\ |  ||\n" +
            "        /                     /`    `\\ ||  ||\n" +
            "       |           .         /        \\||  ||\n" +
            "       |                     |         |/  ||\n" +
            "       /         /           |         (   ||\n" +
            "      /          .           /          )  ||\n" +
            "     |            \\          |             ||\n" +
            "    /             |          /             ||\n" +
            "   |\\            /          |              ||\n" +
            "   \\ `-._       |           /              ||\n" +
            "    \\ ,//`\\    /`           |              ||\n" +
            "     ///\\  \\  |             \\              ||\n" +
            "    |||| ) |__/             |              ||\n" +
            "    |||| `.(                |              ||\n" +
            "    `\\\\` /`                 /              ||\n" +
            "       /`                   /              ||\n" +
            "      /                     |              ||\n" +
            "     |                      \\              ||\n" +
            "    /                        |             ||\n" +
            "  /`                          \\            ||\n" +
            "/`                            |            ||\n" +
            "`-.___,-.      .-.        ___,'            ||\n" +
            "         `---'`   `'----'`";
    String GARGOYLE = "" +
            " \n,                                                               ,\n" +
            " \\'.                                                           .'/\n" +
            "  ),\\                                                         /,( \n" +
            " /__\\'.                                                     .'/__\\\n" +
            " \\  `'.'-.__                                           __.-'.'`  /\n" +
            "\n" +
            "  `)   `'-. \\                                         / .-'`   ('\n" +
            "  /   _.--'\\ '.          ,               ,          .' /'--._   \\\n" +
            "  |-'`      '. '-.__    / \\             / \\    __.-' .'      `'-|\n" +
            "  \\         _.`'-.,_'-.|/\\ \\    _,_    / /\\|.-'_,.-'`._         /\n" +
            "   `\\    .-'       /'-.|| \\ |.-\"   \"-.| / ||.-'\\       '-.    /`\n" +
            "     )-'`        .'   :||  / -.\\\\ //.- \\  ||:   '.        `'-(\n" +
            "    /          .'    / \\\\_ |  /o`^'o\\  | _// \\    '.          \\\n" +
            "    \\       .-'    .'   `--|  `\"/ \\\"`  |--`   '.    '-.       /\n" +
            "     `)  _.'     .'    .--.; |\\__\"__/| ;.--.    '.     '._  ('\n" +
            "     /_.'     .-'  _.-'     \\\\ \\/^\\/ //     `-._  '-.     '._\\\n" +
            "     \\     .'`_.--'          \\\\     //          `--._`'.     /\n" +
            "      '-._' /`            _   \\\\-.-//   _            `\\ '_.-'\n" +
            "          `<     _,..--''`|    \\`\"`/    |`''--..,_     >`\n" +
            "           _\\  ``--..__   \\     `'`     /   __..--``  /_\n" +
            "          /  '-.__     ``'-;    / \\    ;-'``     __.-'  \\\n" +
            "         |    _   ``''--..  \\'-' | '-'/  ..--''``   _    |\n" +
            "         \\     '-.       /   |/--|--\\|   \\       .-'     /\n" +
            "          '-._    '-._  /    |---|---|    \\  _.-'    _.-'\n" +
            "              `'-._   '/ / / /---|---\\ \\ \\ \\'   _.-'`\n" +
            "                   '-./ / / / \\`---`/ \\ \\ \\ \\.-'\n" +
            "                       `)` `  /'---'\\  ` `(`\n" +
            "                      /`     |       |     `\\\n" +
            "                     /  /  | |       | |  \\  \\\n" +
            "                 .--'  /   | '.     .' |   \\  '--.\n" +
            "                /_____/|  / \\._\\   /_./ \\  |\\_____\\\n" +
            "               (/      (/'     \\) (/     `\\)      \\)";
    String HOBGOBLIN = "" +
            "               \n,     _.._     ,\n" +
            "               (`._.\"`    `\"._.')\n" +
            "                '._          _.'               /\\\n" +
            "                 | /`-.  .-'\\ | __           .'.'\n" +
            "                 |(_()_\\/_()_)|'  `\\        ( (\n" +
            "                 ;   ,____,   ;     \\        ) )\n" +
            "                  \\  /VvvV\\  /    \\  \\.__   / /\n" +
            "                 /`'._`\"\"`_.'      \\  \\  `\\/ /\n" +
            "                /  .  `--'          \\  \\    /\n" +
            "               /  / `-,       _.----'   \\  ;\n" +
            "              /  /     )     /  .--------` \\\n" +
            "             /  /.----'     /  /   ___.     \\\n" +
            "            /  /|   _    _,|  (---'   \\     |\n" +
            "           /  / |   \\`\"\"`  \\\\\\\\        \\    |\n" +
            "          / /`  |    |      \\\\\\`        \\   \\\n" +
            "         / /    ;    |                  /   /\n" +
            "        / / _    \\  /                 /`  /`\n" +
            "       / _\\/(    | |                 /  .'_\n" +
            "      | ( \\  '--'  \\               .'  (__)`\\\n" +
            "      \\\\\\\\  `-------'             /________.'\n" +
            "       `\\\\\\";
    String DRAGON = "" +
            "                                   \n/|   /|\n" +
            "                                    / /  / /\n" +
            "                                   | |  | |\n" +
            "                                   ; /  ; /\n" +
            "                     ___  __      / .\\_/ ,(   ___ \n" +
            "                    /  {.' {     / ;;;/ ;;;`\"`_.-'\n" +
            "                 .--'-./ .-'    / ;;;/ ;;' .-'\n" +
            "              _.-` _  `;;\\_,   / ;;;/ .' ,/\n" +
            "          ,-\"` ;-= g>=- .; /  / ;;;/ ;',;;|\n" +
            "           \\`__/_     ; ';|  | ;;;/.',;;;;'\\___,\n" +
            "     _    ,=,-V-' __  ;;  _\\ /.;/`.`.'` .,:---'\n" +
            "     `\"==\"  |_.-'`  7_;;  | | ;|  .',;;;;;/\n" +
            "                   /_,;'  /  \\'\\ `,;;;;;;|\n" +
            "                  {_,;'^ _\\  /;;).,,,,,`'\\\n" +
            "                 {_;;' ^|   /;/`.;;;;;;;-'`\n" +
            "                {_,;'^  _\\ //`.,..`_';/\n" +
            "               (__;;  ^  \\/`.;;;;;( ',|  \n" +
            "               (__,;,^ .'`.;;,.`';;      _.-/\n" +
            "               (__,';,/ ,;'.`;;;,._\\  _.'  ( \n" +
            "                (__,';|/|;';;.';/` .-' _   /\n" +
            "                 (__,-';|; ;;;. |._  `//)_/\n" +
            "                  (_/ '- \\,'``\\ | `'.// \n" +
            "                .-' |'-' '-'';|/ ^   ';\n" +
            "               /'-' | '-' '-' ;`;;.^   `\\\n" +
            "              /  '-' \\  '-' '/\\_, ';,  ^ \\\n" +
            "              |'-' .-'\\-' '-'|  \\_,';,  ^ \\\n" +
            "         _     \\  /    '.'-' \\  //\\_,; ^  |\n" +
            "       ,_v\\     \\ |      \\ '-( |;/ \\_ ;   |\n" +
            "       v_\\ `---_-' \\      ;  / |;|  <_; ^ |\n" +
            "       (.-')(`` `'-'      | /  | ;`=';'  ;\n" +
            "        v  </             ||    \\ `'`  ^/\n" +
            "                          ||     '-...-'\n" +
            "                          ||\n" +
            "                     __  / |_\n" +
            "                   v-=_;` __ `)\n" +
            "                   v-(_.-'  `v\n" +
            "                      v";
}
