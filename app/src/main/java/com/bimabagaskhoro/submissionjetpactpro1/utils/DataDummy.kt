package com.bimabagaskhoro.submissionjetpactpro1.utils

import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityTvShow

object DataDummy {
    fun generateDummyMovie(): List<EntityMovie> {

        val movie = ArrayList<EntityMovie>()

        movie.add(
                EntityMovie(
                        "1",
                        "Mortal Kombat",
                        "04/14/2021",
                        "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yiu9ISHAbbZATKl0FaMPh8is7Oa.jpg"
                )
        )

        movie.add(
                EntityMovie(
                        "2",
                        "Godzilla vs. Kong",
                        "03/24/2021",
                        "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "3",
                        "Nobody",
                        "04/28/2021",
                        "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "4",
                        "The Unholy",
                        "03/31/2021",
                        "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/b4gYVcl8pParX8AjkN90iQrWrWO.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "5",
                        "Thunder Force",
                        "04/09/2021",
                        "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "6",
                        "The Marksman",
                        "01/15/2021",
                        "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "7",
                        "Chaos Walking",
                        "04/07/2021",
                        "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "8",
                        "Monster Hunter",
                        "01/13/2021",
                        "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1UCOF11QCw8kcqvce8LKOO6pimh.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "9",
                        "Vanquish",
                        "04/16/2021",
                        "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AoWY1gkcNzabh229Icboa1Ff0BM.jpg",
                )
        )

        movie.add(
                EntityMovie(
                        "10",
                        "Tom & Jerry",
                        "03/10/2021",
                        "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg",
                )
        )
        return movie
    }

    fun generateDummyTvShow(): List<EntityTvShow> {

        val tvshow = ArrayList<EntityTvShow>()

        tvshow.add(
                EntityTvShow(
                        "1",
                        "The Flash",
                        "(2014)",
                        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "2",
                        "The Good Doctor",
                        "(2017)",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "3",
                        "Luis Miguel: The Series",
                        "(2018)",
                        "he series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "4",
                        "Van Helsing",
                        "(2016)",
                        "Vanessa Helsing, the daughter of famous vampire hunter and Dracula nemesis Abraham Van Helsing is resurrected five years in the future to find out that vampires have taken over the world and that she possesses unique power over them. She is humanity’s last hope to lead an offensive to take back what has been lost.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/r8ODGmfNbZQlNhiJl2xQENE2jsk.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "5",
                        "Grey's Anatomy",
                        "(2005)",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "6",
                        "Invincible",
                        "(2021)",
                        "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "7",
                        "Riverdale",
                        "(2017)",
                        "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "8",
                        "Lucifer",
                        "(2016)",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "9",
                        "WandaVision",
                        "(2021)",
                        "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                )
        )

        tvshow.add(
                EntityTvShow(
                        "10",
                        "The Walking Dead",
                        "(2010)",
                        "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                )
        )
        return tvshow
    }
}