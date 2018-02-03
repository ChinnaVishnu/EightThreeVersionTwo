package com.jocata.star.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.jocata.MarkerChecker.MakerCheckerApprove;
import com.jocata.MarkerChecker.MakerCheckerRejected;
import com.jocata.TranscationSetails.TrancastionDetails;
import com.jocata.star.AddManualEvent.AddManualEventAccountNum;
import com.jocata.star.AddManualEvent.AddManualEventCustomerid;
import com.jocata.star.Administration.AuditLogModuleName;
import com.jocata.star.Administration.ExclusionListAdd;
import com.jocata.star.Administration.NotificationConfigurationUpdate2;
import com.jocata.star.Administration.SysytemConfigurationFalsePositiveLimits;
import com.jocata.star.Administration.UserLeaveRecordAddSecond;
import com.jocata.star.Administration.UserPermissionsReport;
import com.jocata.star.CaseReallocation.CaseReallocationSearch;
import com.jocata.star.Centra.CentraReSubmit;
import com.jocata.star.Centra.CentraRegenerateSTR;
import com.jocata.star.Centra.CentraUpdateSTRDetails;
import com.jocata.star.Centra.CentraViewErrors;
import com.jocata.star.GridAdministartion.RiskConfigurationEdit;
import com.jocata.star.MisReports.AccountRiskReport;
import com.jocata.star.MisReports.ChangeinAccountRiskReport;
import com.jocata.star.MisReports.ReportonCurrentCases;
import com.jocata.star.MisReports.ReportonPastCases;
import com.jocata.star.MisReports.UserPermissionReport;
import com.jocata.star.RuleBulider.RuleBuliderUpdate;
import com.jocata.star.RuleLibry.RuleLibraryAddandDelete;
import com.jocata.star.RuleLibry.RuleLibrarySearchwithRuleId;
import com.jocata.star.RuleLibry.RuleLibrarySearchwithRuleName;
import com.jocata.star.RuleLibry.RuleLibraryUpdate;
import com.jocata.star.RuleSimulation.RuleSimulate;
import com.jocata.star.RuleSimulation.RuleSimulate2;
import com.jocata.star.RuleSimulation.RuleSimulate3;
import com.jocata.star.Taskboard.AccountTrunover;
import com.jocata.star.Taskboard.SearchForTrancations;
import com.jocata.star.Taskboard.TaskboardPastCases;
import com.jocata.star.TaskboardSort.SortOnAmount;
import com.jocata.star.TaskboardSort.SortOnBranch;
import com.jocata.star.TaskboardSort.SortOnCaseId;
import com.jocata.star.TaskboardSort.SortOnLastActivivtyDate;
import com.jocata.star.TaskboardSort.SortOnLastUpdateddate;
import com.jocata.star.WorkFlow.WorkflowSave;
import com.jocata.star.WorkFlow.WorkflowSaveChanges2;
import com.jocata.star.dashboard.DashboardAgeingDrillDown;
import com.jocata.star.dashboard.DashboardLevelSelection;
import com.jocata.star.dashboard.DashboardUserSelection;
import com.jocata.star.dashboard.DashboardWorkFlowDrillDown;

import com.jocata.star.falsepositive.FalsePositiveAddby;
import com.jocata.star.falsepositive.FalsePositiveRuleId;
import com.jocata.star.falsepositive.FalsePositiveUpdate;
import com.jocata.star.falsepositive.FalsepositiveCustomerId;

public class AllStarNewSevenone {

	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		Class[] classes = new Class[] {

				// .................................Dashboard....................................................................//

				DashboardAgeingDrillDown.class, DashboardWorkFlowDrillDown.class, DashboardLevelSelection.class,
				DashboardUserSelection.class,

				// ....................................... Taskboard sort..........................................................//

				SortOnAmount.class, SortOnBranch.class, SortOnCaseId.class, SortOnLastActivivtyDate.class,
				SortOnLastUpdateddate.class,

				TaskboardPastCases.class, AccountTrunover.class, SearchForTrancations.class,

				// .........................................False postivie........................................................//
				FalsePositiveAddby.class, FalsepositiveCustomerId.class, FalsePositiveRuleId.class,
				FalsePositiveUpdate.class,

				// .........................................Add Manual Event......................................................//

				
				 AddManualEventAccountNum.class, //
				 AddManualEventCustomerid.class,
				  // not there

				// CaseReallocation.....................................................//
				// CaseReallocationSearch.class,

				// ............................................Mis Reports.........................................................//

				AccountRiskReport.class,
				// ChangeinAccountRiskReport.class, //change in Acc Risk Report
				ReportonCurrentCases.class, ReportonPastCases.class,
				// UserPermissionReport.class, //

				// .................................................Rulebulider.....................................................//

				RuleBuliderUpdate.class,

				// .....................................................RuleLibrary...................................................//

				RuleLibrarySearchwithRuleName.class, RuleLibrarySearchwithRuleId.class, RuleLibraryUpdate.class,
				RuleLibraryAddandDelete.class,

				// RuleSimulate.class,
				
				//RuleSimulate2.class,
				
				RuleSimulate3.class,

				// .......................................................Centra.......................................................//
				CentraViewErrors.class, CentraUpdateSTRDetails.class,

				CentraRegenerateSTR.class, CentraReSubmit.class,

				// .....................................WorkFlow.........................................................................//
				// WorkflowSave.class,

				// WorkflowSaveChanges2.class,

				// ...................................................Administration.....................................................//
				AuditLogModuleName.class, SysytemConfigurationFalsePositiveLimits.class,

				// UserLeaveRecordAddSecond.class,
				// ExclusionListAdd.class,

				NotificationConfigurationUpdate2.class, TrancastionDetails.class,
				MakerCheckerApprove.class,
				MakerCheckerRejected.class,
				
				UserPermissionsReport.class
				
				
				// ................................................Grid..................................................................//

				// RiskConfigurationEdit.class

		};
		testng.setTestClasses(classes);
		testng.addListener(tla);
		testng.run();
	}

}
