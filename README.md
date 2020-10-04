## Reflections

#### Computer mouse

Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.


•	Test der køre musen fra et x koordinat til et andet

•	Test der køre musen fra et y koordinat til et andet

•	Test der køre musen lineært fra et koordinat til en til given (x,y) koordinat

•	Test hvorpå musen skal køre sequential igennem flere koordinater

•	Test om musen højre og venstre knapper er funktionelle

•	Test om to venstre click imellem en period af tid, vil udføre et double click

•	Test om venstreclick åbner op en propeties felt på computerne

•	Test om musen scroller virker til op og ned

•	Test om musens scroller virker hensigmessigt, at hver click i scroller udføre en scroller handling på computerne.

•	Test hvor meget pres der skal ligges på scrollerne for at autoscroll function er i funktion

•	Test på om musen har den rigtige drag og drop funktionalitet ved at holde venstre musse knap nede

•	Test hastigheden musen bevæger sig i forhold hvor hurtig reaktion er på computerne

•	Test hvilken overfladerne musen er funktionel på

•	Test om connection fra computerne til musen er funktionel

•	Hvis musen er trådløs test afstanden på musen tilkobling til computerne

•	Hvis musen er trådløs test batterilevetiden

•	Hvis musen er trådløs test tænd og sluk knappen

•	Bruger test, om musen er komfortable at havde i hånden


#### Catastrophic failure

Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?

>“A glitch that occurred in December 2015 led to over 3,200 US prisoners being released before their declared date. The software was designed to monitor the behaviour of prisoners and was introduced in 2002. The problem was occurring for about 13 years and on an average prisoners were released almost 49 days in advance. “ 
Cases 4. https://www.cigniti.com/blog/37-software-failures-inadequate-software-testing/  

Der skulle oprettes test til at se om oprettelsen af god opførelse, ikke overskriver deres frigivelse dato. 
Der skulle fremgå test for den normal frigivelse dato, hvorpå der tilføjelse forkortelse af denne dato, ved hjæp af god opførelse. Testen skulle vise at den gode opførelse vil reducere frigivelse datoen korrekt.
Der skulle teste af formindskning  af frigivelse datoen påvirkede den korrekte person i system og ikke manipulerede med andet data i system.


## Investigation of tools

#### JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

•	@Tag 

Tags bliver brugt til at filtere hvilken test der skal blive executed for en test plan. Hvis nogen test kræver længere tid, kan de eksekveres f.eks. om natten, hvor nogen test skal køres hver gang der gemmes.

•	@Disabled 

Disabled tagget bliver brugt til at slå en test til, hvis der skal refactores i koden f.eks. og en test ikke er funktionel mere og skal tilrettes kan dette tag bruges.

•	@RepeatedTest

Kan gentage same test med den samme lifecycle.

•	@BeforeEach

Før hver eneste til vil funktionen med dette tag blive initialized/kørt. Kan bruges hvis et object har brug for at blive initialized for hver test.

•	@AfterEach

Efter hver eneste til vil funktionen med dette tag blive initialized/kørt. Kan bruges til at f.eks. af lukke connectionen ned fra andre systemer. 

•	@BeforeAll

Før alle test vil funktionen med dette tag blive initialized/kørt. Kan bruges hvis en ting skal bruges konsekvent til at alle tests i klassen. 

•	@AfterAll

Efter alle test vil funktionen med dette tag blive initialized/kørt. Kan bruges til at f.eks. af lukke connectionen ned fra andre systemer.

•	@DisplayName 

Kan bruges til at sætte navn på test/testklassen hvis den skal være mere beskrivende.

•	@Nested

Kan bruges hvis man skal teste flere functionalitet i en service. F.eks. hvis finde navnet på en customer, og der er flere funktioner der har denne funktionalitet, kan de blive smidt under en samlede nestede test hvorpå alle afhentninger af navnet vil blive kørt


•	assumeFalse, assumeTrue

Disse bliver brugt til at se om test er true eller false, f.eks. hvis assumeFalse er false vil testene blive abortet fordi der ikke er brug for mere testing efter dette. Hvormed assumeTrue fortæller hvis testen er true vil testene køre videre ellers vil den arbote testene.


## Mocking frameworks

Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)

Valgte: Mockito, EasyMock 

•	What are their similarities?

>* allow the same level verification as EasyMock (unexpected invocations, redundant invocations, verification in order)

> * argument matchers (anyInt(), anyObject(), etc.)

 har taget det snippet fra https://code.google.com/archive/p/mockito/wikis/MockitoVSEasyMock.wiki, pga. jeg syns det var svært at finde noget korrekt der tilknytter som de ikke beskriver. Mockito skriver selv at de har været meget inspiret af hvordan easyMock var opbygget og har taget inspiration for dem, og lighederne ligger i disse to punkter.


•	What are their differences?

>* no record/replay modes - no need for them. There only 2 things you can do with Mockito mocks - verify or stub. Stubbing goes before execution and verification afterwards.

>* all mocks are 'nice' (even somehow nicer, because collection-returning methods return empty collections instead of nulls). Even though mocks are nice, you can verify them as strictly as you want and detect any unwanted interaction.

>* explicit language for better readability: verify() and when() VS the mixture of expect(mock.foo()) and mock.foo() (plain method call without 'expect'). I'm sure some of you will find this argument subjective :)

>* simplified stubbing model - stubbed methods replay all the time with stubbed value no matter how many times they are called. Works exactly like EasyMock's andStubReturn(), andStubThrow(). Also, you can stub with different return values for different arguments (like in EasyMock).

>* Verification of stubbed methods is optional because usually it's more important to test if the stubbed value is used correctly rather than where's it come from.

>* verification is explicit - verification errors point at line of code showing what interaction failed.

>* verification in order is flexible and doesn't require to verify every single interaction.

>* custom argument matchers use hamcrest matchers, so you can use your existing hamcrest matchers. (EasyMock can also integrate with hamcrest though it is not a part of EasyMock but hamcrest. See the documentation of hamcrest).

Har taget snippet fra https://code.google.com/archive/p/mockito/wikis/MockitoVSEasyMock.wiki.
Som skrevet er det ikke stor forskel på mocking libarys, dog har Mockito two ekstra ting til sig Veify Stub, som tages i brug. De små forskelle ligger også i hvordan mocked udføres. Der er forskellige navngivninger, ihvorpå man kan tage valget om hvilket mocking værktøj man vil tage i brug.

•	Which one would you prefer, if any, and why?

Jeg ville forsætte med at bruge Mockito fordi den har ekstra funktionalitent med Stub og Verify, for at få den ekstra funktionalitet med hvis der er brug for det. Ud over er måden man anvender deres metoder også mere simple i forhold til EasyMocks. 


