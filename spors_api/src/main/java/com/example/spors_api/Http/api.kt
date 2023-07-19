package com.example.spors_api.Http

import android.content.Context
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import okhttp3.OkHttpClient

class api(context: Context) {

    private var token : String? = null;



    init {
        System.loadLibrary("keys")
        token = context.packageName
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
    private external fun teamid2() : String
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
    private external fun searchmatchwithoutdate(): String
    private external fun top_score(): String

    suspend fun getlivematch(): String? {
        val match = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${getlive()}", token!!)
            dara
        }
        return match.await();
    }

    suspend fun getfixturematchbydate(date: String = "2022-10-05"): String? {
        val fixture_match = CoroutineScope(Dispatchers.IO).async {
            val dara =  HttpHelp().getRequest("${getdomain()}${getfixturebydaye()}${date}",token!!)
            dara
        }
        return fixture_match.await();
    }

    suspend fun getallleague(): String? {
        val league = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${league()}",token!!)
            dara
        }
        return league.await();
    }

    suspend fun getstatistics(fixtureid: Int = 866612): String? {
        val static = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${statisticbyfixtureid()}$fixtureid",token!!)
            dara
        }
        return static.await();
    }

    suspend fun getstanding(league: Int = 39, season: Int = 2019): String? {
        val static = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${standingbyleagueseason()}${leagueid()}${league}/${seasonid()}${season}",token!!)
            dara
        }
        return static.await();
    }

    suspend fun getallteambyleagueid(league: Int = 39, season: Int = 2019): String? {
        val allteam = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teambyseasonleague()}${seasonid()}${season}/${leagueid()}${league}",token!!)
            dara
        }
        return allteam.await();
    }

    suspend fun getteammatch(teamid: Int = 33, season: Int = 2019): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturebyteam()}${teamid()}${teamid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getteaminfo(teamid: Int = 33): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teaminformation()}${teamid()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getteamstatiaties(teamid: Int = 33, league: Int = 39, season: Int = 2019): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamstatiaties()}${leagueid()}${league}/${teamid()}${teamid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getfixturedetails(fixture: Int = 946889): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturedetails()}${fixture}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getheadtohead(headtoheadid: String = "33-34"): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${headtohead()}${headtoheadid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getlineup(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${linup()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getfixturestatistic(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixturestatistic()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getplayerstatistic(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playerstatistic()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getfixtureevent(fixtureid: Int = 36584): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixtureevent()}${fixtureid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getfixtureleaguedate(date : String = "2022-10-05", league: Int= 807, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${fixtureleaguedate()}${date}/${leagueid()}${league}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getteamplayerlist( teamid: Int = 140, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamplayerlist()}${seasonid()}${season}/${teamid2()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getplayerlistseasonleagueteam( teamid: Int = 140, season : Int = 2022, leagueid : Int=61): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${teamplayerlist()}${seasonid()}${season}/${teamid()}${teamid}/${leagueid()}${leagueid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getplayertransfer(teamid: Int = 463, playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playertransfer()}${playerid()}${playerid}/${teamid()}${teamid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getsingleplayerinfo( season: Int = 2019,  playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${singleplayerinfo()}${playerid()}${playerid}/${seasonid()}${season}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getplayersquard( playerid : Int=35845): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${playersquard()}${playerid}",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun getleague_fixture(league: Int= 807, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${leagueid()}${league}/${seasonid()}$season",token!!)
            dara
        }
        return teammatch.await();
    }

    suspend fun gettop_score(league: Int= 807, season : Int = 2022): String? {
        val teammatch = CoroutineScope(Dispatchers.IO).async {
            var dara =  HttpHelp().getRequest("${getdomain()}${top_score()}$league/${seasonid()}$season",token!!)
            dara
        }
        return teammatch.await();
    }

}