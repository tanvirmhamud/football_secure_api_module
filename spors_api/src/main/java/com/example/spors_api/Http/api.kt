package com.example.spors_api.Http

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

class api {

    private var token : String? = null;

    init {
        System.loadLibrary("keys")
        token = "live-soccer-tv-footballl-live-tv"
    }

    private external fun getdomain(): String
    private external fun getlive(): String
    private external fun getfixturebydaye() : String
    private external fun league() : String
    private external fun statisticbyfixtureid() : String
    private external fun standingbyleagueseason() : String
    private external fun leagueid() : String
    private external fun seasonid() : String
    private external fun teamid() : String
    private external fun playerid(): String
    private external fun teambyseasonleague() : String
    private external fun fixturebyteam() : String
    private external fun teaminformation() : String
    private external fun teamstatiaties(): String
    private external fun fixturedetails(): String
    private external fun headtohead(): String
    private external fun linup(): String
    private  external fun fixturestatistic() : String
    private external fun playerstatistic() : String
    private external fun fixtureevent() : String
    private external fun fixtureleaguedate() : String
    private external fun teamplayerlist() : String
    private external fun playertransfer() : String
    private external fun singleplayerinfo() : String
    private external fun playersquard() : String


    suspend fun livematch(): String? {
        val match = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${getlive()}", token!!)
            dara
        }
        return match.await();
    }

    suspend fun fixture_match_by_date(date: String = "2022-10-05"): String? {
        val fixture_match = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${getfixturebydaye()}$date",token!!)
            dara
        }
        return fixture_match.await();
    }

    suspend fun all_league(): String? {
        val league = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${league()}",token!!)
            dara
        }
        return league.await();
    }

    suspend fun statistics(fixtureid: Int = 866612): String? {
        val static = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${statisticbyfixtureid()}$fixtureid",token!!)
            dara
        }
        return static.await();
    }

    suspend fun standing(league: Int = 39, season: Int = 2019): String? {
        val static = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${standingbyleagueseason()}${leagueid()}${league}/${seasonid()}${season}",token!!)
            dara
        }
        return static.await();
    }

    suspend fun all_team_by_league_id(league: Int = 39, season: Int = 2019): String? {
        val allteam = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teambyseasonleague()}${seasonid()}${season}/${leagueid()}${league}",token!!)
            dara
        }
        return allteam.await();
    }

    suspend fun team_match(teamid: Int = 33, season: Int = 2019): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturebyteam()}${teamid()}${teamid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun teaminfo(teamid: Int = 33): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teaminformation()}${teamid()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun teamstatiaties(teamid: Int = 33, league: Int = 39, season: Int = 2019): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamstatiaties()}${leagueid()}${league}/${teamid()}${teamid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun fixturedetails(fixture: Int = 946889): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturedetails()}${fixture}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun headtohead(headtoheadid: String = "33-34"): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${headtohead()}${headtoheadid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun lineup(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${linup()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun fixture_statistic(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturestatistic()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun player_statistic(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playerstatistic()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun fixture_event(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixtureevent()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun fixture_league_date(date : String = "2022-10-05", league: Int= 807, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixtureleaguedate()}${date}/${leagueid()}${league}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun team_playerlist( teamid: Int = 140, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamplayerlist()}${seasonid()}${season}/${teamid()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun playerlist_season_league_team( teamid: Int = 140, season : Int = 2022, leagueid : Int=61): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamplayerlist()}${seasonid()}${season}/${teamid()}${teamid}/${leagueid()}${leagueid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun player_transfer( teamid: Int = 463,  playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playertransfer()}${playerid()}${playerid}/${teamid()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun single_player_info( season: Int = 2019,  playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${singleplayerinfo()}${playerid()}${playerid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun player_squard( playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playersquard()}${playerid}",token!!)
            dara
        }
        return teammatch.await();
    }

}