/**
 * 
 */
package org.crow.dm;

/**
 * @author viksin
 *
 */
public class RemoveStopWords {
	
	private String[] stopWords={ " a "," a's "," abaft "," able "," aboard "," about "," above "," according "," accordingly "," across "," actually "," afore ",
            " aforesaid "," after "," afterwards "," again "," against "," agin "," ago "," ain't "," aint "," albeit "," all "," almost ",
            " alone "," along "," alongside "," already "," also "," although "," always "," am "," amid "," amidst "," among "," amongst ",
            " an "," and "," anent "," another "," any "," anybody "," anyhow "," anyone "," anything "," anyway "," anyways "," anywhere ",
            " apart "," are "," aren't "," around "," as "," aside "," aslant "," at "," athwart "," available "," away "," b "," back "," barring ",
            " be "," became "," because "," become "," becomes "," becoming "," been "," before "," beforehand "," behind "," being "," below ",
            " beneath "," beside "," besides "," best "," better "," between "," betwixt "," beyond "," both "," but "," by "," c "," c'mon "," c's ",
            " came "," can "," can't "," cannot "," cant "," certain "," certainly "," circa "," clearly "," come "," comes "," comwww "," cos ",
            " could "," couldn't "," couldst "," currently "," d "," de "," definitely "," despite "," did "," didn't "," do "," does "," doesn't ",
            " doing "," don't "," done "," down "," downwards "," during "," durst "," e "," each "," either "," else "," elsewhere "," enough ",
            " entirely "," ere "," especially "," et "," etc "," even "," ever "," every "," everybody "," everyone "," everything ",
            " everywhere "," except "," excepting "," f "," failing "," far "," few "," first "," five "," followed "," following ",
            " follows "," for "," from "," further "," furthermore "," g "," get "," gets "," getting "," given "," gives "," go "," goes ",
            " going "," gone "," gonna "," got "," gotta "," gotten "," h "," had "," hadn't "," hardly "," has "," hasn't "," hast "," hath ",
            " have "," haven't "," having "," he "," he'd "," he'll "," he's "," hence "," her "," here "," here's "," hereafter "," hereby ",
            " herein "," hereupon "," hers "," herself "," hi "," him "," himself "," his "," hither "," how "," how's "," howbeit "," however ",
            " i "," i'd "," i'll "," i'm "," i've "," id "," ie "," if "," il "," in "," inasmuch "," inc "," indeed "," inner "," inside "," insofar ",
            " instantly "," instead "," into "," inward "," is "," isn't "," it "," it'd "," it'll "," it's "," its "," itself "," j "," just "," l "," la ",
            " lately "," latter "," latterly "," le "," least "," left "," less "," lest "," let "," let's "," likely "," likewise "," m "," mainly ",
            " many "," may "," maybe "," mayn't "," me "," meanwhile "," merely "," mid "," midst "," might "," mightn't "," more "," moreover ",
            " most "," mostly "," much "," must "," mustn't "," my "," myself "," n "," namely "," nd "," near "," nearly "," needn't "," needs ",
            " neither "," never "," nevertheless "," no-one "," nobody "," non "," none "," noone "," nor "," normally "," not "," nothing ",
            " notwithstanding "," now "," nowhere "," o "," o'er "," obviously "," oc "," of "," off "," oh "," ok "," okay "," on "," once "," one ",
            " ones "," oneself "," only "," onto "," or "," other "," others "," otherwise "," ought "," oughtn't "," our "," ours "," ourselves ",
            " out "," outside "," over "," overall "," p "," particular "," particularly "," past "," per "," perhaps "," possible "," probably ",
            " q "," qua "," que "," quite "," qv "," r "," rather "," reasonably "," regardless "," relatively "," respectively "," s "," same ",
            " sans "," secondly "," seem "," seemed "," seeming "," seems "," seen "," self "," selves "," seriously "," several "," shall ",
            " shalt "," shan't "," she "," she's "," shed "," shell "," short "," should "," shouldn't "," since "," so "," some "," somebody ",
            " somehow "," someone "," something "," sometime "," sometimes "," somewhat "," somewhere "," soon "," still "," such "," sure ",
            " t "," t's "," tends "," that "," that'd "," that'll "," that's "," thats "," the "," thee "," their "," their's "," theirs "," them ",
            " themselves "," then "," thence "," there "," there's "," thereafter "," thereby "," therefore "," therein "," theres "," thereupon ",
            " these "," they "," they'd "," they'll "," they're "," they've "," thine "," think "," third "," this "," tho "," thorough "," thoroughly ",
            " those "," thou "," though "," three "," thro' "," through "," throughout "," thru "," thus "," thyself "," till "," to "," together "," too ",
            " toward "," towards "," truly "," u "," under "," underneath "," unfortunately "," unless "," unlike "," unlikely "," until "," unto "," up ",
            " upon "," usually "," v "," versus "," very "," via "," vs "," w "," was "," wasn't "," way "," we "," we'd "," we'll "," we're "," we've "," were ",
            " weren't "," wert "," what "," what'll "," what's "," whatever "," when "," when's "," whence "," whencesoever "," whenever "," where ",
            " where's "," whereafter "," whereas "," whereby "," wherein "," whereupon "," wherever "," whether "," which "," whichever "," whichsoever ",
            " while "," whilst "," whither "," who'd "," who'll "," who's "," whoever "," whole "," whom "," whore "," whose "," whoso "," whosoever "," why ",
            " will "," willing "," wish "," with "," within "," without "," won't "," wont "," would "," wouldn't "," wouldst "," y "," ye "," yes "," yet "," yk ",
            " you "," you'd "," you'll "," you're "," you've "," your "," yours "," yourself "," yourselves ",
            ": ",", ","? "," - ","'s "," yesterday "," A "," B "," C "," D "," E "," F "," G ","This ","The ","He ","For ",
            " H "," J "," K "," L "," M "," N "," O "," P "," Q "," R "," S "," T "," U "," V "," W "," X "," Y "," Z "};

	/**
	 * @param stopWords the stopWords to set
	 */
	public void setStopWords(String[] stopWords) {
		this.stopWords = stopWords;
	}

	/**
	 * @return the stopWords
	 */
	public String[] getStopWords() {
		return stopWords;
	}
	public String removeStopwords(String text)
	{
		RemoveStopWords rsw = new RemoveStopWords();
		//text = text.toLowerCase();
		for(String s:rsw.getStopWords())
		{
			if(text.contains(s))
			{
				System.out.println(s);
				text= text.replaceAll(s, " ");
								
			}
			
		}
		//System.out.println(text.indexOf(".")+" "+text.length());
		text=text.replace(".", " ");
		System.out.println(text);
		return text;
		
	}

}
